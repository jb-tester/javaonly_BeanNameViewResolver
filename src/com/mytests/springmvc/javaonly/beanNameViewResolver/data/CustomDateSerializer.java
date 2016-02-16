package com.mytests.springmvc.javaonly.beanNameViewResolver.data;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/9/2016.
 * Project: javaonly_BeanNameViewResolver
 * *******************************
 */
public class CustomDateSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date arg0, JsonGenerator arg1,
                          SerializerProvider arg2) throws IOException, JsonProcessingException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String formattedDate = formatter.format(arg0);
        arg1.writeString(formattedDate);
    }
}