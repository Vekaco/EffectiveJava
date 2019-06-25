package org.effectivejava.examples.chapter06.item35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunSample2 {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;
        int failed = 0;
        Class clz = Class.forName(args[0]);
        for (Method m : clz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                }  catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    Class<? extends Exception>[] excTypes = m.getAnnotation(ExceptionTest.class).values();
                    int oldPassed=passed;
                    for (Class<? extends Exception> excType: excTypes) {
                        if (excType.isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }
                    if (passed == oldPassed) {
                        System.out.printf("Test %s failed: got %s%n", m, exc);
                        failed++;
                       
                    } 
                    
                }catch (Exception e) {
                    System.out.println("INVALID @ExceptionTest:" + m);
                    failed++;

                }
            }
        }
        System.out.printf("Passed:%d,Failed:%d%n", passed, failed);
    }
}
