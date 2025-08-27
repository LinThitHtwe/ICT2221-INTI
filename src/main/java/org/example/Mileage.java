package org.example;
import java.util.Scanner;

/**
 This program calculate mileage in java
 */

public class Mileage {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner scanner = new Scanner(System.in);
        //Define variable
        double milesDriven ,gallonsUsed, milesPerGallon;

        System.out.println("This program will calculate mileage");

        // Get Miles Driven
        System.out.print("Enter miles driven : ");
        milesDriven = scanner.nextDouble();

        // Get Gallons Used
        System.out.print("Enter gallons used : ");
        gallonsUsed = scanner.nextDouble();

        // calculate miles per gallon if gallons used is more than 0 (to avoid dividing by zero)
        if(gallonsUsed > 0) {
            milesPerGallon = milesDriven / gallonsUsed;
            // Display result
            System.out.println("Miles per gallon : " + milesPerGallon);
        }
        else{
            //Display that we cannot calculate (divide by zero)
            System.out.println("Gallon used is zero. Cannot calculate mileage");
        }


    }
}
