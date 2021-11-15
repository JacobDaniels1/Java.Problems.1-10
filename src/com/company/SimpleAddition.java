//2. Write a Java program to print the sum of two numbers.

package com.company;
import java.util.Scanner;
public class SimpleAddition {
   int sum1;
   int sum2;

   public SimpleAddition(int first, int second){
       sum1 = first;
       sum2 = second;
   }

   public void simpleAddition(){
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
      int combined = first + second;
      System.out.println("Sum is: " + combined);


   }

}
