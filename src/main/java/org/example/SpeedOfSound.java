package org.example;

import java.util.Scanner;

public class SpeedOfSound {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String medium;
        double distance, time =0.0;

        System.out.print("Enter the medium (air, water or steel) : ");
        medium = scanner.nextLine();

        System.out.print("Enter the distance (ft) : ");
        distance = scanner.nextDouble();

        if(medium.equalsIgnoreCase("air")) {
            time = distance / 1100.0;
        }
        else if(medium.equalsIgnoreCase("water")) {
            time = distance / 4900.0;
        }
        else if(medium.equalsIgnoreCase("steel")) {
            time = distance / 16400.0;
        }
        else {
            System.out.println("Invalid medium");
        }
        System.out.println("The medium is " + medium);
        System.out.println("The distance is " + distance);
        System.out.printf("The amount of time it take sound to travel is %.4f seconds",time);
    }

}
