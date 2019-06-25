package org.effectivejava.examples.chapter06.item35;

//maker annotation type declaration
import java.lang.annotation.*;

/**
 * indicates that the annotated method is a test method.
 * Use only on parameter-less static method
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}
