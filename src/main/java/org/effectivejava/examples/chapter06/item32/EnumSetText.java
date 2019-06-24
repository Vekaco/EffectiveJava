package org.effectivejava.examples.chapter06.item32;

import java.util.Set;

//enumset - a modern replacement for bit fields
public class EnumSetText {
    //any set could be passed in, but enumset is clearly best
    public void applyStyle(Set<Style> style) {//...
    }

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}
}
