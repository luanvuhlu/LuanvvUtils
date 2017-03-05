package com.luanvv.utils.time;

import java.util.Date;

/**
 * Created by luan vu on 3/5/2017.
 */
public class DateConvert {
    public static java.sql.Date convertSql(Date date){
        if(date == null){
            return null;
        }
        return new java.sql.Date(date.getTime());
    }
}
