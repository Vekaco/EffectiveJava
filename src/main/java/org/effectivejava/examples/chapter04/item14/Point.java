package org.effectivejava.examples.chapter04.item14;

public class Point {
    //通过为私有域提供setter/getter的方式提供API，而非提供公开/保护/包内私有域
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
