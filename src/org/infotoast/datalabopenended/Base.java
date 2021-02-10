package org.infotoast.datalabopenended;

public class Base {
    private int x;
    private int y;
    private String owner;
    public Base(String o, int x1, int y1) {
        owner = o;
        x = x1;
        y = y1;
    }

    public String getOwner() {
        return owner;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDistance(Base b) {
        int run = Math.abs(x - b.getX());
        int rise = Math.abs(y - b.getY());
        return (int)Math.round(Math.sqrt((run^2)+(rise^2)));

    }
}
