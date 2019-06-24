package org.effectivejava.examples.chapter05.item29;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class AnnotationDemo {

    static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
        Class<?> annotationTYpe = null;
        try {
            annotationTYpe = Class.forName(annotationTypeName);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return element.getAnnotation(annotationTYpe.asSubclass(Annotation.class));
    }

   // public <T extends Annotation> T getAnnotation(Class<T> annotationType);
}
