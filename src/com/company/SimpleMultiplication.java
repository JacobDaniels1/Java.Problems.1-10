//5. Write a Java program that takes two numbers as input and display the product of two numbers

package com.company;

import java.util.Scanner;


    public class SimpleMultiplication {

        int product;

        public SimpleMultiplication(){
        }

        public void simpleMultiplication(){
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
            int product = first * second;
            System.out.println("Product is: " + product);


        }

    }
