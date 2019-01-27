/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.twis.model;

import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * TODO 在此写上类的相关说明.<br>
 * @author yxm <br>
 * @version 1.0.0 2019年1月9日<br>
 * @see 
 * @since JDK 1.8
 */
public class JsonDateFormatFull2Stamp extends JsonSerializer<Date> {
    
	@Override
	public void serialize(Date value, JsonGenerator jgen,
			SerializerProvider provider) throws

	IOException, JsonProcessingException {
		SimpleDateFormat formatter =   new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		String formattedDate = formatter.format(value);
		long time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(formattedDate, new ParsePosition(0)).getTime() / 1000;
		jgen.writeString(String.valueOf(time));
	}

}

