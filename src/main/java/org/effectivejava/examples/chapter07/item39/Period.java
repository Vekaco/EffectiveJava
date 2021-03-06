package org.effectivejava.examples.chapter07.item39;

import java.util.Date;

//broken "immutable" time period class
public class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        if(start.compareTo(end) > 0)
            throw new IllegalArgumentException(start + " after " + end);

        this.start = start;
        this.end = end;
    }

    public Date start() {return start;}
    public Date end() {return  end;}

    //remainder omitted.
 }
