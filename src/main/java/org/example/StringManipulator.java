package org.example;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName;

        System.out.print("Enter your favorite city name: ");
        cityName = scanner.nextLine();

        System.out.println("The number of characters in the city name -" + cityName.length());
        System.out.println("The name of city in all uppercase letters - " + cityName.toUpperCase());
        System.out.println("The name of city in all lowercase letters - " + cityName.toLowerCase());
        System.out.println("The first character in the name of the city - " + cityName.charAt(0));

    }
}
