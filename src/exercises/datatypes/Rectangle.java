package exercises.datatypes;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length: ");
        double length= input.nextInt();
        System.out.println("Enter a width: ");
        double width= input.nextInt();
        double area= length * width;

        System.out.println("The area of rectangle of " + "length: " + length  +  " and width: "  + width + "  is:  " + area);

    }

}