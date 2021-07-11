package exercises.datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        double miles= input.nextInt();
        System.out.println("Enter gallons of gas used: ");
        double gallons= input.nextInt();
        double mpg= miles / gallons;

        System.out.println("Your distance in miles " + miles + " and gallons of gas "  + gallons +  " equals " + mpg + " miles per gallon");

    }
}
