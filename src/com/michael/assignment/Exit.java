package com.michael.assignment;

/**
 * Exit
 */
public class Exit {
    private int x;
    private int y;
    private boolean notOpened;

    public Exit(int _x, int _y) {
        this.x = _x;
        this.y = _y;
        this.notOpened = true;
    }


    public String toString() {
        return "Exit" + Util.objectStr(x, y, notOpened);
    }


	public void open(Player player) {
        if (player.getCollectedDots() == 3 && player.getX() == x && player.getY() == y) {
            notOpened = false;
        }
	}
    
    public boolean getNotOpened() {
        return this.notOpened;
    }
}