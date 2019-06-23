package org.effectivejava.examples.chapter04.item21;

import java.io.Serializable;

public class Host {

    //通过宿主类来导出策略接口
    private static class StrLenCmp implements Comparator<String>, Serializable {

        @Override
        public int compare(String t1, String t2) {
            return t1.length() - t2.length();
        }
    }
    public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();
}
