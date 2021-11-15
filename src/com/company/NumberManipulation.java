//6. Write a Java program to print the sum (addition), mutract, divltiply, subide and remainder of two numbers

package com.company;
import java.util.Scanner;

public class NumberManipulation {
    int addition;
    int subtraction;
    int division;
    int multiplication;
    int remainder;

    public NumberManipulation() {
    }

    public void numberManipulation(){
        System.out.println("*******************************************");
        System.out.println("Please enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.println("First number is: " + first);
        System.out.println();
        System.out.println("Please enter the second number");
        int second = scanner.nextInt();
        System.out.println("Second number is: " + second);
        System.out.println();
        int addition = first + second;
        int subtraction = first - second;
        int division = first / second;
        int multiplication = first * second;
        int remainder = first % second;
        int product = first * second;
        System.out.println(first + " + " + second + " = "  + addition);
        System.out.println(first + " - " + second + " = "  + subtraction);
        System.out.println(first + " * " + second + " = "  + multiplication);
        System.out.println(first + " / " + second + " = "  + division);
        System.out.println(first + " remainder " + second + " = "  + remainder);

    }

}
