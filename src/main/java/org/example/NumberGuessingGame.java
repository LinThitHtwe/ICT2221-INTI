package org.example;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(9)+1;
        int userGuess;

        System.out.println("Guess the number between 1 and 9");
        userGuess = sc.nextInt();

        while (userGuess != randomNumber) {

            if (userGuess < randomNumber) {
                System.out.println("The number you entered is too low");
            }
            else {
                System.out.println("The number you entered is too high");
            }

            System.out.println("Guess the number between 1 and 9 again ");
            userGuess = sc.nextInt();
        }

        System.out.println("You guessed the number between 1 and 10!!");
    }
}
