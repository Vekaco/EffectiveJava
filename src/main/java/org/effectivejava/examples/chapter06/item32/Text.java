package org.effectivejava.examples.chapter06.item32;

//这种表示法让你用OR位运算将几个常量合并到一个集合中，称做位域
public class Text {
    public static final int STYLE_BOLD = 1 << 0;//1
    public static final int STYLE_ITALIC = 1 << 1; //2
    public static final int STYLE_UNDETLINE = 1 << 2;//4
    public static final int STYLE_STRIKETHROUGH = 1 << 3;//8

    //parameter is bitwise OR of zero or more STYLE_ constants
    public void applyStyle(int styles) {//...
    }

}
