package org.effectivejava.examples.chapter02.item05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
    //不要为已知的不会被修改可变对象进行重复创建
    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }
    //other fields, methods and constructors omitted


    //判断一个对象是否在人口出生高峰期出生，每次调用的时候都会创建Calendar, TimeZone, Date
    public boolean isBabyBoomer(){
        //DON'T DO THIS!
        Calendar gmtCal =  Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY,1,0,0,0);
        Date boomStart = gmtCal.getTime();

        gmtCal.set(1965, Calendar.JANUARY, 1,0,0,0);
        Date boomEnd = gmtCal.getTime();

        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
    }

}
