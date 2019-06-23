package org.effectivejava.examples.chapter04.item21;

public class StringLengthComparator {
    private StringLengthComparator(){}

    public static final StringLengthComparator INSTANCE = new StringLengthComparator();
    //过于specific，可以添加接口来实现比较策略
    public int compare(String str1, String str2) {
        return str1.length() - str2.length();
    }
}
