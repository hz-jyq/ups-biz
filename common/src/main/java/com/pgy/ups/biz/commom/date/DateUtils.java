package com.pgy.ups.biz.commom.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    // 获得某天最大时间 2017-10-15 23:59:59
    public static Date getEndOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());;
        LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
        return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    // 获得某天最小时间 2017-10-15 00:00:00
    public static Date getStartOfDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDay = localDateTime.with(LocalTime.MIN);
        return Date.from(startOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }


    // 获得某天最小时间 2017-10-15 00:00:00
    public static Date getDaySubtract(Date date,int i) {
        Calendar calendar = Calendar.getInstance();// 得到一个Calendar的实例
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -1 * i);// 日期减
        return calendar.getTime();
    }

    public static String getSimpleDateFormat(Date date,String format) {
        String  str = null;
        try {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
            str = simpleDateFormat.format(date);
        }catch (Exception e){

        }
        return  str;
    }

    public static String getSimpleDateFormatYYYMMDD(Date date) {
        return  getSimpleDateFormat(date,"yyyy-MM-dd");
    }


    public static  String  getDateForString(Date date){
      String str =  getSimpleDateFormatYYYMMDD(date);
        String[]  args = str.split("-");
        String  dateString = args[0] + args[1] + args[2];
        return dateString;
    }

    public static  String getSimpleDateFormatYmdHms(Date date) {
        return  getSimpleDateFormat(date,"yyyy-MM-dd HH:mm:ss");

    }
}
