package org.effectivejava.examples.chapter11.item76;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class MutablePeriod {
    //A period instance
    public final Period period;
    //period's start field, to which we shouldn't have access
    public final Date start;
    //period's end field to which we shouldn't have access
    public final Date end;

    public MutablePeriod() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(bos);
            //serialize a valid period instance
            out.writeObject(new Period(new Date(), new Date()));
            /**
             * append rogue "previous object refs" for internal
             * Date fields in Period. for details, see "Java
             * Object Serialization Specification" section 6.4
             */
            byte[] ref = {0x71, 0, 0x7e, 0, 5};//ref #5
            bos.write(ref);//the start field
            ref[4] = 4;//ref #4
            bos.write(ref);//the end field
            //deserialize period and stolen date references
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            period = (Period) in.readObject();
            start = (Date) in.readObject();
            end = (Date) in.readObject();
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args) {
        MutablePeriod mp = new MutablePeriod();
        Period p= mp.period;
        Date pEnd = mp.end;
        //lets turn back the clock
        pEnd.setYear(78);
        System.out.println(p);
        //bring back the 60s
        pEnd.setYear(69);
        System.out.println(p);
    }
}
