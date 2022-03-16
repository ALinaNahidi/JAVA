package com.section3projects;

import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        int userGuess = 0;
        int originalNumber;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        originalNumber = random.nextInt(100) + 1;

        while (userGuess != originalNumber) {
            System.out.println("Guess the number between 1 to 100");
            userGuess = scanner.nextInt();
            count++;

            if (userGuess >= 1 && userGuess <= 100) {
                if (userGuess > originalNumber) {
                    System.out.println("Your guess is too high");
                } else if (userGuess == originalNumber) {

                    System.out.println("Congratulations! Your guessed the number in " + count + " guesses! thanks for playing!");
                    break;
                } else {
                    System.out.println("Your guess is too low");
                }

            } else
                System.out.println("Invalid input");
        }

    }

}
