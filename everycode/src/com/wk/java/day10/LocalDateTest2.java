package com.company.javadaily;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @ClassName LocalDateTest2
 * @Description TODO
 * @Author WL
 * @Date 2020/10/30
 **/
public class LocalDateTest2 {
    /**
     * 获取当前时间
     */
    public static void getCurrentTime() {
        LocalTime time = LocalTime.now();
        System.out.println("Local time now" + time);
    }

    /**
     * 增加小时数
     */
    public static void plusHours() {
        LocalTime time = LocalTime.now();
        //增加两小时
        LocalTime newTime = time.plusHours(2);
        System.out.println("Time after 2 hours : " + newTime);
    }
    /**
     * 如何计算一周后的时间
     */
    public static void nextWeek() {
        LocalDate today = LocalDate.now();
        //使用变量赋值
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Today is " + today);
        System.out.println("Date after 1 week "+ nextWeek);
    }
    /**
     * 计算一年前或一年后的日期
     */
    public static void minusDate() {
        LocalDate today = LocalDate.now();
        //使用变量赋值
        LocalDate minusDate = today.minus(1,ChronoUnit.YEARS);
        System.out.println("Today is " + today);
        System.out.println("Date after 1 year" + minusDate);
    }
    /**
     * 时钟类
     */
    public static void clock() {
        //根据系统时间返回当前时间
        Clock clock = Clock.systemUTC();
        System.out.println("Clock :" + clock);
        //根据系统时钟区域返回时间
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock:" + defaultClock);
    }
    /**
     * 使用YearMonth类处理特定的日期
     */
    public static void checkCardExpiry() {
        YearMonth currentMonth = YearMonth.now();
        System.out.printf("Days in month year %s: %d%n" ,currentMonth,currentMonth.lengthOfMonth());
        YearMonth creditCardExpiry = YearMonth.of(2028, Month.FEBRUARY);
        System.out.printf("Your credit card expires on %s %n",creditCardExpiry);
    }
    /**
     * 检查闰年
     */
    public static void isLeapYear() {
        LocalDate today = LocalDate.now();
        if (today.isLeapYear()) {
            System.out.println("This year is leap year");
        } else {
            System.out.println("This year is not leap year");
        }

    }
    /**
     * 如何使用Java判断日期是早于还是晚于另一个日期
     */
    public static void isBeforeIsAfter() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = LocalDate.of(2018, 1 ,29);
        if (tomorrow.isAfter(today)) {
            System.out.println("Tomorrow comes after today");
        }
        //减去一天
        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
        if (yesterday.isBefore(today)) {
            System.out.println("Yesterday is day before today");
        }

    }
    /**
     * 获取特定时区下面的时间
     */
    public static void getZoneTime() {
        //设置时区
        ZoneId america = ZoneId.of("America/New_york");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localDateTime, america);
        System.out.println("现在的日期和时间在特定的时区 ：" + dateAndTimeInNewYork);
    }
    /**
     * 计算两个日期之间的天数和月数
     */
    public static void calcDateDays() {
        LocalDate today = LocalDate.now();
        LocalDate java8Release = LocalDate.of(2018, Month.MAY,14);
        Period periodToNextJavaRelease = Period.between(today, java8Release);
        System.out.println("Months left between today and java 8 release :" +periodToNextJavaRelease);
    }
    /**
     * 使用预定义的格式化工具解析或格式化日期
     */
    public static void formatDate() {
        String dayAfterTomorrow = "20180210";
        LocalDate formatted = LocalDate.parse(dayAfterTomorrow, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("Date generated from String %s is %s %n" ,dayAfterTomorrow ,formatted);
    }

    public static void main(String[] args) {
        getCurrentTime();
        plusHours();
        nextWeek();
        minusDate();
        clock();
        isBeforeIsAfter();
        getZoneTime();
        checkCardExpiry();
        isLeapYear();
        calcDateDays();
        formatDate();
    }



}

