package org.effectivejava.examples.chapter07.item39;

import org.junit.Test;

import java.util.Date;

public class PeriodTest {

    @Test
    public void testPeriod() {
        //attack the internals of a period instance
        Date start = new Date();
        Date end  = new Date();
        Period  p = new Period(start, end);
        System.out.println(p.start() + ";" + p.end());
        end.setYear(78);//modifies internals of p!!!
        System.out.println(p.start() + ";" + p.end());
    }

    @Test
    public void testRepairedPeriod() {
        Date start = new Date();
        Date end  = new Date();
        RepairedPeriod  p = new RepairedPeriod(start, end);
        System.out.println(p.start() + ";" + p.end());
        end.setYear(78);//modifies internals of p!!!
        System.out.println(p.start() + ";" + p.end());
    }

    @Test
    public void testSecondAttack(){
        Date start = new Date();
        Date end  = new Date();
        RepairedPeriod  p = new RepairedPeriod(start, end);
        System.out.println(p.start() + ";" + p.end());
        p.end().setYear(78);//modifies internals of p!!!
        System.out.println(p.start() + ";" + p.end());
    }
    @Test
    public void testRepairSecondAttack(){
        Date start = new Date();
        Date end  = new Date();
        RepairedPeriod2  p = new RepairedPeriod2(start, end);
        System.out.println(p.start() + ";" + p.end());
        p.end().setYear(78);//modifies internals of p!!!
        System.out.println(p.start() + ";" + p.end());
    }
}
