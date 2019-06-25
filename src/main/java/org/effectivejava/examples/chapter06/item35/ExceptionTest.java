package org.effectivejava.examples.chapter06.item35;

//annotation type with a parameter
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * indicates that the annotated method is a test method yhsy
 *  must throw the designated exception to succeed
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
    Class<? extends Exception>[] values();
}
