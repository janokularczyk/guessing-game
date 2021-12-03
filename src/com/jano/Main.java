package com.jano;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001b[0m";
    public static final String ANSI_GREEN = "\u001b[32m";
    public static final String ANSI_MAGENTA = "\u001b[35m";

    public static void main(String[] args) {
        getAppInfo();
        greetUser();

        while (true) {
            int guess = 0;
            int max = 10;
            int min = 1;

            Random random = new Random();
            int correctNumber = random.nextInt(max - min + 1) + min;

            System.out.println("Guess a number between 1 and 10");

            while (guess != correctNumber) {
                Scanner scanner = new Scanner(System.in);
                guess = scanner.nextInt();
                if (guess != correctNumber) {
                    System.out.println(ANSI_MAGENTA + "Wrong number, please try again" + ANSI_RESET);
                }
            }
            System.out.println(ANSI_GREEN + "CORRECT!!! You guessed it" + ANSI_RESET);
            System.out.println("Play Again? [Y or N]");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next().toUpperCase();
            if (answer.equals("Y")) {
                continue;
            } else if (answer.equals("N")) {
                return;
            } else {
                return;
            }
        }
    }
    public static void getAppInfo(){
        String appName = "Number Guesser";
        String appVersion = "1.0.0";
        String appAuthor = "Jano";
        System.out.println(ANSI_GREEN + appName + ": Version " + appVersion + " by " + appAuthor + ANSI_RESET);
    }

    public static void greetUser() {
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        System.out.println("Hello " + inputName + ", let's play a game...");
    }
}