package org.effectivejava.examples.chapter02.item05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class OptimizedPerson {
    // other fields, methods, and constructors omitted
    private final Date birthDate;

    //static date as class fields, and won't create new objects each time invoke methods.
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    //只在类初始化是实例化一次Calendar,Date,TimeZone
    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY,1,0,0,0);
        BOOM_START = gmtCal.getTime();

        gmtCal.set(1965, Calendar.JANUARY,1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public OptimizedPerson(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer(){
        return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
    }

}
