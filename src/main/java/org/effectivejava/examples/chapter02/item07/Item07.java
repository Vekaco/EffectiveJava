package org.effectivejava.examples.chapter02.item07;

public class Item07 {
    @Override
    protected void finalize() throws Throwable {
        try {
            //finalize subclass state
            //以这种方式，在子类finalize出现异常时，通过调用父类finalize得以执行
        } finally {
            super.finalize();
        }
    }
}
