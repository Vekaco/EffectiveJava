package org.effectivejava.examples.chapter02.item07;

//finalizer guardian idiom
public class Foo {
    //sole purpose of this object is to finalize outer Foo object
    private final Object finalizerGuardian = new Object() {
        @Override
        protected void finalize() throws Throwable {
            //终结外部对象，即Foo实例中的的对象
            super.finalize();
        }
    };


}
