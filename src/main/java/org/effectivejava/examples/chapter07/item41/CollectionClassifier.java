package org.effectivejava.examples.chapter07.item41;

import java.util.Collection;
import java.util.List;
import java.util.Set;

//Broken - what does this program print?
public class CollectionClassifier {

    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst){
        return "List";
    }

    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }

}
