package com.company;
import java.util.Scanner;
public class ShowMenu {
    private int option;
    private String name;

    public ShowMenu(String name) {
        this.name = name;
    }

   void showMenu(){
        Scanner scanner = new Scanner(System.in);

        do {
        System.out.println("*******************************************");
        System.out.println("Please select from the following programs:");
        System.out.println("1. Hello world");
        System.out.println("2. Simple addition");
        System.out.println("3. Simple division");
        System.out.println("4. Simple multiplication");
        System.out.println("5. Number Manipulation");
        System.out.println("10. exit");
        System.out.println("*******************************************");
            this.option = scanner.nextInt();

switch (option){
    case 1:
        HelloWorld test1 = new HelloWorld("");
        test1.helloWorld();
        break;

    case 2:
        SimpleAddition test2 = new SimpleAddition(1, 1);
        test2.simpleAddition();
        break;

    case 3:
        SimpleDivision test3 = new SimpleDivision();
        test3.simpleDivision();
        break;

        case 4:
        SimpleMultiplication test4 = new SimpleMultiplication();
        test4.simpleMultiplication();
        break;

    case 5:
        NumberManipulation test5 = new NumberManipulation();
        test5.numberManipulation();
        break;

}
    } while (option != 10);

}
}
