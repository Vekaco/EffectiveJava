package org.effectivejava.examples.chapter07.item39;

import java.util.Date;

public class RepairedPeriod2 {
    private final Date start;
    private final Date end;

    public RepairedPeriod2(Date start, Date end) {
        //repaired constructor - makes defensive copies of parameters
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        //NOTE: valid check is after defensive copies!!! and not for the defensive copies objects,
        //not for the original input objects. to avoid the changes during copy in multi-thread environments.
        if(this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start + " after " + end);


    }

    //repaired accessors - make defensive copies of internal fields
    public Date start() {return new Date(start.getTime());}
    public Date end() {return  new Date(end.getTime());}

}
