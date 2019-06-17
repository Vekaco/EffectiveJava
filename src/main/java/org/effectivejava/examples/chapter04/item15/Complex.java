package org.effectivejava.examples.chapter04.item15;

//终态类：不可继承扩展 item15第2点
public final class Complex {

    //私有终态域：item15第3和4点
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    //不提供修改状态的方法，只提供读取的方法
    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    //复数加法
    public Complex add(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    //复数减法
    public Complex subtract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    //复数乘法
    public Complex multiply(Complex c) {
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    }

    public Complex divide(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) / tmp);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + hashDouble(re);
        result = 31 * result + hashDouble(im);
        return result;
    }

    private int hashDouble(double val) {
        long longBits = Double.doubleToLongBits(val);
        return (int) (longBits^(longBits>>>32));
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(!(obj instanceof Complex))
            return  false;

        Complex c = (Complex) obj;
        return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
    }

    @Override
    public String toString() {
        return "(" + re + "+" + im +"i" + ")";
    }
}
