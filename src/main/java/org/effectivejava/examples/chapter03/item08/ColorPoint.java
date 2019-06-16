package org.effectivejava.examples.chapter03.item08;

import java.awt.*;

public class ColorPoint extends Point {
    private final Color color;


    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    //不覆盖父类方法，导致颜色属性被忽略
    /**
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPoint)){
            return false;
        }
        return super.equals(obj) && ((ColorPoint)obj).color == color;
    }
    **/
    @Override
    public boolean equals(Object obj) {
        //混合比较时忽略颜色
        if(!(obj instanceof Point)){
            return false;
        }
        //与Point比较忽略颜色
        if (!(obj instanceof ColorPoint)) {
            return obj.equals(this);
        }
        //同类型比较时，需要比较颜色
        return super.equals(obj) && ((ColorPoint)obj).color == color;

    }
}
