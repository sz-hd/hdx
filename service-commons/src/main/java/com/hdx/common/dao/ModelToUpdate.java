package com.hdx.common.dao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.hdx.common.exception.ModelException;
import com.hdx.model.Column;
import com.hdx.model.Table;

/**
 * 
 * @author yxm
 *
 */
public abstract class ModelToUpdate {

	@Autowired
	public static BaseDao baseDao;
	/**
	 * 把 model 转化成可执行的更新语句
	 * 返回map对象 :key:sql->sql语句,key:para->参数(Object数组)
	 * sql:update table set column=?,column=?…… where id = ?
	 * para:Object[]{String,Integer}
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static Map<String, Object> convertUpdateSql(Object model) throws Exception {
		return convertUpdateSql(model,null);
	}

	/**
	 * 把 model 转化成可执行的更新语句
	 * 返回map对象 :key:sql->sql语句,key:para->参数(Object数组)
	 * sql:update table set column=?,column=?…… where id = ?
	 * para:Object[]{String,Integer}
	 * 数据以json数据为准
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static synchronized Map<String, Object> convertUpdateSql(Object model, Map<String, Object> parameter) throws Exception {
		StringBuffer sqlUpdate = new StringBuffer();
		List<Object> para= new ArrayList<Object>();
		Map<String, Object> convertSql = new HashMap<String, Object>();
		
		Table table = model.getClass().getAnnotation(Table.class);
		
		sqlUpdate.append(" update ");
		sqlUpdate.append(table.name());
		sqlUpdate.append(" set ");
		StringBuffer sqlWhere = new StringBuffer();
		int isqlUpdate = sqlUpdate.toString().length();
		Field[] fields = model.getClass().getDeclaredFields();
		
		long updateId = 0;
		String sUpdateId = "";
		for (Field field : fields) {
			Column column = field.getAnnotation(Column.class);
			if (column != null) {
				//if (column.is_table_partitioning()){
				//	convertSql.put("is_table_partitioning", true);
				//}
				field.setAccessible(true);
				if (column.isId().equals("true")) {
					sqlWhere.append(" where " + column.name() + " = ? ");
					if(parameter!=null){
						if(parameter.containsKey(field.getName())){
							Class<?> type = field.getType();
							Object obj = ModelToSqlValue.convertParameter(column,field, parameter.get(field.getName()));
							if (type.equals(Long.class) || type.equals(long.class)){
								updateId = Long.valueOf(obj.toString());
							} else if (type.equals(Integer.class) || type.equals(int.class)) {
								updateId = Integer.valueOf(obj.toString());
							} else if (type.equals(String.class)) {
								sUpdateId = obj.toString();
							}
						}else{
							throw new ModelException("ID不能为空！");
						}
					}else{
						Object value = field.get(model);
						updateId = Integer.valueOf(value.toString());
					}
				} else {
					if (column.enableUpdate() == false) continue; //add by ben
					
					if(parameter!=null){
//						ModelToSqlValue.checkRequired(column, parameter.get(field.getName()));
						if(parameter.containsKey(field.getName())){
							ModelToSqlValue.checkRequiredByNull(column, parameter.get(field.getName())); //add by ben
							convertSql(sqlUpdate,isqlUpdate,column);
							Object obj = ModelToSqlValue.convertParameter(column,field, parameter.get(field.getName()));
							if(obj.getClass().equals(Boolean.class)){
								para.add(ModelToSqlValue.convertParameterBoolean(obj));
							}else{
								para.add(obj);
							}
						}
						
					}else{
						Object value = field.get(model);
//						ModelToSqlValue.checkRequired(column, value);
						if (value != null) {
							ModelToSqlValue.checkRequiredByNull(column, value); //add by ben
							convertSql(sqlUpdate,isqlUpdate,column);
							if(value.getClass().equals(Boolean.class)){
								para.add(ModelToSqlValue.convertParameterBoolean(value));
							}else{
								para.add(value);
							}
						}
					}
				}
			}
		}
		sqlUpdate.append(sqlWhere);
		if (StringUtils.hasText(sUpdateId)) {
			para.add(sUpdateId);
		} else {
			para.add(updateId);
		}
		convertSql.put("sql", sqlUpdate.toString());
		convertSql.put("para",para );
		return convertSql;
		
	}
	
	private  static void convertSql(StringBuffer sqlUpdate,int isqlUpdate,Column column){
		sqlUpdate.append(sqlUpdate.toString().length() > isqlUpdate ? ",": "");
		sqlUpdate.append(column.name() + " = ? ");
	}

}
