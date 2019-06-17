package org.effectivejava.examples.chapter04.item14;

public class Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;
    //公开暴露不可变域，影响相对较小，但不推荐这样的方式暴露API
    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {
        if(hour<0 || hour>=HOURS_PER_DAY) {
            throw new IllegalArgumentException();
        }
        if(minute<0 || minute>=MINUTES_PER_HOUR){
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
    }
}
