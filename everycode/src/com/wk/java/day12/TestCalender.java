package com.company.javadaily.day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName TestCalender
 * @Description TODO
 * @Author WL
 * @Date 2020/11/1
 **/
public class TestCalender {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int dayOfMonth = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        Calendar call = Calendar.getInstance();
        call.set(Calendar.YEAR, 2020);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");
        Calendar cal2 = Calendar.getInstance();
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");
        //加两天
        cal2.add(Calendar.DAY_OF_YEAR, 2);
        //减三年
        cal2.add(Calendar.YEAR, -3);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        Calendar cal3 = Calendar.getInstance();
        Date date = cal3.getTime();
        System.out.println(date);
    }
}
