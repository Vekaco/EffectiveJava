package org.effectivejava.examples.chapter03.item12;

import java.util.Comparator;

//违反对称性
public class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {

    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {

        /**
         if(obj instanceof CaseInsensitiveString) {
         return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
         }
         //here violates symmetry!!!

         if(obj instanceof String){
         return s.equalsIgnoreCase((String) obj);
         }
         return false;
         **/

        //避免不同类之间的互操作
        return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }

    @Override
    public int compareTo(CaseInsensitiveString o) {
        return String.CASE_INSENSITIVE_ORDER.compare(s,o.s);

    }
}
