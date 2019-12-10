package com.michael.assignment;

import java.util.Scanner;

/**
 * Game
 */
public class Game {
    private Player player;
    
    private Dot dot1;
    private Dot dot2;
    private Dot dot3;

    private Exit exit;
    private Enemy enemy;

    private Scanner moveInput = new Scanner(System.in);

    public Game(int x, int y) {
        this.player = new Player(x, y);
        this.dot1 = new Dot(1,1);
        this.dot2 = new Dot(2,2);
        this.dot3 = new Dot(3,3);
        this.exit = new Exit(4,4);
        if (x == 5) {
            this.enemy = new Enemy(true);
        } else {
            this.enemy = new Enemy(false);
        }
    }
    
    public void move(int dx, int dy) {
        player.move(dx, dy);
        player.collect(dot1);
        player.collect(dot2);
        player.collect(dot3);
        exit.open(player);
        if (enemy.getExists()) {
            enemy.kill(player);
            enemy.move(player);
        }
    }

    public String toString() {
        return player + " " + dot1 + " " + dot2 + " " + dot3 + " " + exit + " " + enemy;
    }

    public void input() {
        char move;
        System.out.print("Move (l/r/u/d): ");
        move = moveInput.nextLine().charAt(0);

        switch (move) {
            case 'u':
                move(0, -1);
                break;

            case 'd':
                move(0, 1);
                break;

            case 'l':
                move(-1, 0);
                break;

            case 'r':
                move(1, 0);
                break;
        
            default:
                System.out.println("Invalid move");
                break;
        }

    }

    public void start() {        
        System.out.println(toString());

        while (exit.getNotOpened() && player.getAlive()) {
            input();
            System.out.println(toString());
        }
        
        if (player.getAlive()) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        
    }

}