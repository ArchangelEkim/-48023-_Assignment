package com.michael.assignment;

/**
 * Enemy
 */
public class Enemy {

    private int x;
    private int y;

    private boolean exists;

    public Enemy(boolean created) {
        x = 5;
        y = 5;
        exists = created;
    }

	public void move(Player player) {
        int xDifference;
        int yDifference;

        xDifference = player.getX() - x;
        yDifference = player.getY() - y;
        
        if (Integer.compareUnsigned(xDifference, yDifference) > 0) {
            if (xDifference > 0) {
                x++;
            } else {
                x--;
            }
        } else if (Integer.compareUnsigned(xDifference, yDifference) < 0) {
            if (yDifference > 0) {
                y++;
            } else {
                y--;
            }
        } else {
            
        }
	}

	public void kill(Player player) {
        if (player.getX() == x && player.getY() == y) {
            player.die();
        }
	}

    public String toString() {
        if (exists) {
            return "Enemy" + Util.objectStr(x, y, exists);
        } else {
            return "";
        }
        
    }

    /**
     * @return exists
     */
    public boolean getExists() {
        return exists;
    }
}