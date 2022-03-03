package com.game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    static int dice() {
        System.out.print("Roll the Dice (True/False) ? "); //Player Event to roll the dice or skip the turn
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
        return random.nextInt(3) ;
    }

    public static void main(String[] args) {

        int playerPos = 0;
        int diceRollCount = 1;
        //Main Game
        while (true){
            diceRollCount++;
            int rollNumber = dice();
            System.out.println(rollNumber);
            switch (GameEvent()) {
                case 0 -> System.out.println("No Play!");
                case 1 -> {
                    if (playerPos + rollNumber == 100){
                        System.out.println("You Won");
                        System.out.println("Dice was rolled " + diceRollCount + "Times");
                        System.exit(0);
                    }
                    else if (playerPos + rollNumber > 100){
                        System.out.println("Cant move further till you get exactly 100");//Player can't move further
                    }
                    else {
                        System.out.println("LADDERS. Move Ahead " + rollNumber + " steps.");
                        playerPos += rollNumber;
                    }
                }
                case 2 -> {
                    if (playerPos <= 0){
                        System.out.println("SNAKES. You are back to 0. Lol.");//Player can't move below 0.
                        playerPos = 0;
                    }
                    else{
                        System.out.println("SNAKES. Go back " + rollNumber + " steps.");
                        playerPos -= rollNumber;
                    }
                }
            }
            System.out.println("You are at: " + playerPos);
        }

    }

}
