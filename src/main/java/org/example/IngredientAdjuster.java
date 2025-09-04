package org.example;

import java.util.Scanner;

public class IngredientAdjuster {

    public static void main(String[] args) {
        final double SUGAR_CUPS = 1.5;
        final double BUTTER_CUPS = 1.0;
        final double FLOUR_CUPS = 2.75;
        final int BASE_COOKIES = 48;
        int desiredCookies;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many cookies would you like to make? :");
        desiredCookies = scanner.nextInt();

        double scale = (double) desiredCookies / BASE_COOKIES;

        System.out.println("\nTo make " + desiredCookies + " cookies, you will need:");
        System.out.printf("%.2f cups of sugar%n", SUGAR_CUPS * scale);
        System.out.printf("%.2f cups of butter%n", BUTTER_CUPS * scale);
        System.out.printf("%.2f cups of flour%n", FLOUR_CUPS * scale);
    }

}
