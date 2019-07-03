package org.effectivejava.examples.chapter10.item69;

import java.util.concurrent.ConcurrentHashMap;

public class StringIntern {

    //concurrent cannibalizing map atop concurrentMap - not optimal
    private static final ConcurrentHashMap<String,String> map = new ConcurrentHashMap<String, String>();

    public static String intern(String s) {
        String previousValue = map.putIfAbsent(s,s);
        return previousValue == null?s:previousValue;
    }

    //concurrent cannibalizing map atop concurrentMap - faster!
    public static String fasterIntern(String s) {
        String result = map.get(s);
        if(result == null) {
            result = map.putIfAbsent(s,s);
            if(result == null) {
                result = s;
            }
        }
        return result;
    }

}
