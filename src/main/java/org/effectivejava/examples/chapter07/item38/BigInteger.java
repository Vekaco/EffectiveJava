package org.effectivejava.examples.chapter07.item38;

//javadoc
public class BigInteger {
    //对于私有非导出方法，采用断言来检查参数
    private static void sort(long a[], int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
        //do some computation
    }

    //对于公有导出方法 要写明Javadoc

    public int signum() {
        return 0;
    }

    /**
     * Returns a BigInteger whose value is ( this mod m). this method
     * differs from the remainder method in that it always returns a non-negative BigInteger.
     *
     * @param m the modulus, which must be positive
     * @return this mod m
     * @throws ArithmeticException if m is less than or equal to 0.
     */
    public BigInteger mod(BigInteger m) throws ArithmeticException {
        if (m.signum() <= 0)
            throw new ArithmeticException("Modulus <= 0" + m);

        //do the computation
        return new BigInteger();
    }
}
