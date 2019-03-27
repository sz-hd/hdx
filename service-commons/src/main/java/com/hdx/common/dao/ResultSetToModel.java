package com.hdx.common.dao;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;

import com.hdx.model.Column;
import com.hdx.model.JoinTable;

/**
 * 结果集转化成model对象
 * 
 * @author yxm
 *
 */
public class ResultSetToModel {

	@SuppressWarnings("unused")
	public  static synchronized void resultSetForModel(ResultSet rs, Object obj)
			throws SQLException, InstantiationException, IllegalAccessException {
		resultSetForModel(obj,rs,"",1);
	}
	
	private static synchronized void resultSetForModel(Object obj,ResultSet rs,String prefix,int i) throws SQLException, InstantiationException, IllegalAccessException{
		++i;
		Field[] fields = null;
	    if(obj.getClass().getSuperclass().getName().equalsIgnoreCase("java.lang.Object")||obj.getClass().getSuperclass().getName().equalsIgnoreCase("com.twis.model.BaseObject")) {
	    	fields = obj.getClass().getDeclaredFields();
	    } else {
	    	fields = obj.getClass().getDeclaredFields();
	    	int fields_len = fields.length;
	    	Field[] _fields = obj.getClass().getSuperclass().getDeclaredFields();
	    	fields = Arrays.copyOf(fields, fields_len+_fields.length);
	    	System.arraycopy(_fields, 0, fields, fields_len, _fields.length);
	    }
		
		for (Field field : fields) {
			field.setAccessible(true);
			Column column = field.getAnnotation(Column.class);
			JoinTable joinTable = field.getAnnotation(JoinTable.class);
			if (column != null) {
				if (isExistColumn(rs, prefix+column.name())) {
					resultSetForModel(rs, column, obj, field, prefix);
				}
			}else if (joinTable != null) {
				if(i<=3){
					Object objtmp = field.getType().newInstance();
					Field[] fields1 = null;
				    if(obj.getClass().getSuperclass().getName().equalsIgnoreCase("java.lang.Object")||obj.getClass().getSuperclass().getName().equalsIgnoreCase("com.twis.model.BaseObject")) {
				    	fields1 = obj.getClass().getDeclaredFields();
				    } else {
				    	fields1 = obj.getClass().getDeclaredFields();
				    	int fields1_len = fields1.length;
				    	Field[] _fields = obj.getClass().getSuperclass().getDeclaredFields();
				    	fields1 = Arrays.copyOf(fields, fields1_len+_fields.length);
				    	System.arraycopy(_fields, 0, fields, fields1_len, _fields.length);
				    }
					for (Field field1 : fields1) {
						Column column1 = field1.getAnnotation(Column.class);
						if (column1 != null&&isExistColumn(rs, joinTable.prefix()+column1.name())) {
							field.set(obj, objtmp);
							resultSetForModel(objtmp,rs,joinTable.prefix(),i);
							break;
						}
					}
					
				}
			}
		}
	}

	/**
	 * 把数据封装到model属性
	 * 
	 * @param rs
	 * @param column
	 * @param obj
	 * @param field
	 * @param prefix
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws SQLException
	 * @throws InstantiationException
	 */
	private static void resultSetForModel(ResultSet rs, Column column, Object obj,
			Field field, String prefix) throws IllegalArgumentException,
			IllegalAccessException, SQLException, InstantiationException {

		String columnName = prefix + column.name();
		if (isExistColumn(rs, columnName)) {
			field.set(obj, rs.getObject(columnName));
		}

	}

	/**
	 * 判断要获取的列是否存在
	 * 
	 * @param rs
	 * @param columnName
	 * @return
	 * @throws SQLException
	 */
	private static Boolean isExistColumn(ResultSet rs, String columnName)
			throws SQLException {
		ResultSetMetaData resultSetMetaData = rs.getMetaData();
		int colNum = 0;
		colNum = resultSetMetaData.getColumnCount();
		Boolean b = false;
		for (int i = 1; i <= colNum; i++) {
			//getColumnLabel 获取别名的，getColumnName是获取表名字段的
			String name = resultSetMetaData.getColumnLabel(i);
			if (columnName.equalsIgnoreCase(name)) {
				b = true;
				break;
			}
		}
		return b;
	}
}
