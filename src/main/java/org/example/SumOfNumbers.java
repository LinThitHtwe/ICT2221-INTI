package org.example;

import java.util.Scanner;

public class SumOfNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int enteredNumber = 0;
        int currentNum =0;

        while(enteredNumber < 1) {
            System.out.print("Enter a positive nonzero integer: ");
            enteredNumber = sc.nextInt();
        }

        while(currentNum <= enteredNumber) {
            sum += currentNum;
            currentNum++;
        }

        System.out.println("The sum of the number from 1 to " + enteredNumber + ": " + sum);

    }
}
