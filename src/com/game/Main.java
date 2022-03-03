package com.game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


    static int dice() {
        System.out.print("Roll the Dice (True/False) ? ");
        boolean playerEvent = scanner.nextBoolean();
        if (playerEvent) {
            System.out.print("You got - ");
            return random.nextInt(6) + 1;
        }
        else {
            System.out.println("Chance Passed!!");
            return 0;
        }
    }

    static int GameEvent(){
        return random.nextInt(3);
    }

    public static void main(String[] args) {
        int rollNumber = dice();
        System.out.println(rollNumber);
        switch (GameEvent()) {
            case 0 -> System.out.println("No Play!");
            case 1 -> System.out.println("Ladder. Move Ahead " + rollNumber + " steps.");
            case 2 -> System.out.println("Snakes. Go back " + rollNumber + " steps.");
        }
    }
}
