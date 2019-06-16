package org.effectivejava.examples.chapter03.item11;

public class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;
    //若大多数对象被用做散列键，则创建实例时初始化，否则可参考如下方式进行lazily initialize
    private volatile int hashCode;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {

        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 999, "line number");

        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException("name" + ":" + arg);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof PhoneNumber))
            return false;
        PhoneNumber phoneNumber = (PhoneNumber) obj;
        return phoneNumber.areaCode == areaCode && phoneNumber.prefix == prefix && phoneNumber.lineNumber == lineNumber;
    }

    //不覆盖hashCode将导致无法进行匹配。

    @Override
    public int hashCode() {

        //不可变的类 将hashcode作为类域以避免重复计算。
        int result = hashCode;

        if (result == 0) {
            result = 17;
            result = 31 * result + (int) areaCode;
            result = 31 * result + (int) prefix;
            result = 31 * result + (int) lineNumber;
            hashCode = result;
        }

        return result;
    }

    /**
     * 对toString的覆盖，要写好格式说明，特别是对于格式细节编程和数据持久化的引用而言
     * 返回格式如下 （xxx） yyy-zzzz
     * @return
     */
    @Override
    public String toString() {
        return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
    }

    @Override
    protected PhoneNumber clone() throws CloneNotSupportedException {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();// cant happen
        }
    }
}
