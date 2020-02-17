package com.itcast.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GetTimeListUtil {
    public static List<Date> getTimeList(){
        List<Date> TimeList = new ArrayList<>();
        Calendar now = Calendar.getInstance();
        for (int i = 0; i < 5 ; i++) {
            now.add(Calendar.HOUR,2);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH");
            String format = sdf.format(now.getTimeInMillis());
            System.out.println(format);
        }
        return TimeList;
    }

    public static void main(String[] args) {
        List<Date> timeList = getTimeList();
    }
}
