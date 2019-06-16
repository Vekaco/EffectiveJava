package org.effectivejava.examples.chapter03.item08;

import java.awt.*;

public class OptimizedColorPoint {
    //在添加新属性时，复合优先于继承
    private final Point point;
    private final Color color;

    public OptimizedColorPoint(int x, int y, Color color){
        if(color == null)
            throw new NullPointerException();
        point = new Point(x,y);
        this.color = color;
    }

    /**
     * return the point-view of this color point.
     */
    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof OptimizedColorPoint))
            return false;

        OptimizedColorPoint cp = (OptimizedColorPoint) obj;

        return cp.point.equals(point) && cp.color == color;
    }
}
