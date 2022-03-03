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
            return random.nextInt(6) + 1;
        }
        else {
            System.out.println("Chance Passed!!");
            return 0;
        }
    }

    public static void main(String[] args) {
        int rollNumber = dice();
        System.out.println(rollNumber);
    }
}
