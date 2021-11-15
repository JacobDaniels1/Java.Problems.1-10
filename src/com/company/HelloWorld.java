//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.


package com.company;
import java.util.Scanner;
public class HelloWorld {
    String name;

    public HelloWorld(String s) {
        this.name = s;
    }

    public void helloWorld(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************************************");
        System.out.println("please input your name.");
        this.name = scanner.next();
        System.out.println("Hello");
        System.out.println(name);



    }


}
