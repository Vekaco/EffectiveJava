package org.effectivejava.examples.chapter06.item32;

import org.junit.Test;

import java.util.EnumSet;

public class TextTest {
    @Test
    public void testText() {
        Text text = new Text();
        text.applyStyle(Text.STYLE_BOLD | Text.STYLE_ITALIC);
    }

    @Test
    public void textEnumSetText() {
        EnumSetText text = new EnumSetText();
        text.applyStyle(EnumSet.of(EnumSetText.Style.UNDERLINE, EnumSetText.Style.ITALIC));
    }
}
