package org.effectivejava.examples.chapter06.item35;

import java.util.ArrayList;
import java.util.List;

//program containing annotations with a parameter
public class Sample2 {

    @ExceptionTest(values = ArithmeticException.class)
    public static void m1(){//test should pass
        int i=0;
        i=i/i;
    }
    @ExceptionTest(values = ArithmeticException.class)
    public static void m2(){//should fail - wrong exception
        int[] a = new int[0];
        int i=a[1];
    }

    @ExceptionTest(values = ArithmeticException.class)
    public static void m3(){}//should fail - no exception

    //code containing an annotation with an array parameter
    @ExceptionTest(values = {IndexOutOfBoundsException.class, NullPointerException.class})
    public static void doublyBad() {
        List<String> list = new ArrayList<String>();
        // the spec permits this method to throw either indexoutofboundsexception or nullpointerexceptipn
        list.addAll(5,null);
    }
}

