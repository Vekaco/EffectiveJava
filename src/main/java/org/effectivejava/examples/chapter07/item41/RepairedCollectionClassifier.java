package org.effectivejava.examples.chapter07.item41;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class RepairedCollectionClassifier {

    public static String classify(Collection<?> c) {
        return c instanceof Set ? "Set" : c instanceof List ? "List" : "Unknown Collection";
    }
}
