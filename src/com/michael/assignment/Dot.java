package com.michael.assignment;

/**
 * Dot
 */
public class Dot {
    private int x;
    private int y;

    private boolean exists;
    
    public Dot(int _x, int _y) {
        this.x = _x;
        this.y = _y;
        this.exists = true;
    }

    public void disappear() {
        exists = false;
    }

    public String toString() {
        return "Dot" + Util.objectStr(x, y, exists);
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the y
     */
    public boolean exists() {
        return exists;
    }
}