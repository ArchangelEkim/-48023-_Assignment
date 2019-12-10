package com.michael.assignment;

/**
 * Player
 */
public class Player {
    private int x;
    private int y;

    private int collectedDots;

    private boolean alive;

	public Player(int _x, int _y) {
        x = _x;
        y = _y;
        collectedDots = 0;
        alive = true;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void collect(Dot dot) {
        if (dot.getX()== x && dot.getY()== y && dot.exists()) {
            collectedDots ++;
            dot.disappear();
        }
    }

    public void die() {
        alive = false;        
    }

    public String toString() {
        return "Player[" + "*".repeat(collectedDots) + "]" + Util.objectStr(x, y, alive);
    }

    /**
     * @return the collectedDots
     */
    public int getCollectedDots() {
        return collectedDots;
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
    public boolean getAlive() {
        return alive;
    }

}