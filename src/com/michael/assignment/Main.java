package com.michael.assignment;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int init_x = 0;
        int init_y = 0;
        
        init_x = intInput("x", 3);
        init_y = intInput("y", 3);
        
        Game mainGame = new Game(init_x, init_y);
        mainGame.start();
    }
    
    private static int intInput(String coord, int attemptMax) {
        int number = -1;
        int attempts = 0;
        
        while (number < 0 && attempts < attemptMax) {
            System.out.print("Initial " + coord + ": ");
            number = input.nextInt();
            input.nextLine();
            attempts++;
            if (number < 0) {
                System.out.println("Must not be negative.");
            }
        }

        if (number < 0 && attempts >= 3) {
            System.out.println("Too many errors. Exiting.");
            System.exit(0);
        }

        return number;
    }

}