package org.effectivejava.examples.chapter07.item39;

import java.util.Date;

public class RepairedPeriod {

        private final Date start;
        private final Date end;

        public RepairedPeriod(Date start, Date end) {
            //repaired constructor - makes defensive copies of parameters
            this.start = new Date(start.getTime());
            this.end = new Date(end.getTime());

            //NOTE: valid check is after defensive copies!!! and not for the defensive copies objects,
            //not for the original input objects. to avoid the changes during copy in multi-thread environments.
            if(this.start.compareTo(this.end) > 0)
                throw new IllegalArgumentException(start + " after " + end);


        }

        public Date start() {return start;}
        public Date end() {return  end;}

    }
