package com.itcast.utis;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StringToDateConverter implements Converter<String, Date> {
    /**
     *
     * @param s 传进来的参数
     * @return
     */
    @Override
    public Date convert(String s) {
        if(s == null)
            throw new RuntimeException("参数有误");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
