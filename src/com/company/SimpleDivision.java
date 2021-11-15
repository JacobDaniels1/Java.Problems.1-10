//3. Write a Java program to divide two numbers and print on the screen.

package com.company;
import java.util.Scanner;
public class SimpleDivision {

    double combined;

    public SimpleDivision(){

    }

    public void simpleDivision(){
        System.out.println("*******************************************");
        System.out.println("Please enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        System.out.println("First number is: " + first);
        System.out.println();
        System.out.println("Please enter the second number");
        double second = scanner.nextDouble();
        System.out.println("Second number is: " + second);
        System.out.println();
        Double combined = first / second;
        System.out.println("Quotient is: " + combined);
    }

}