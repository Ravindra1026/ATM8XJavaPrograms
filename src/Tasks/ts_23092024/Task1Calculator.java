package Tasks.ts_23092024;

import java.util.Scanner;

public class Task1Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Variable declaration
        double num1;
        double num2;
        String operations;
        // User input
        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.println("Enter operation (+, -, *, /, %): ");
        operations = scanner.next();
        //performing operation based on user input
        switch (operations){
            case "+":
                System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
            break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " +(num1-num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " +(num1*num2));
                break;
            case "/":
                if(num2 != 0)
                System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
                else
                    System.out.println("Error: Division by 0 is not allowed");
                break;
            case "%":
                if(num2 != 0)
                    System.out.println(num1 + " % " + num2 + " = " +(num1%num2));
                else
                    System.out.println("Error: Modulus by 0 is not allowed");
                break;
            default:
                System.out.println("Error: Enter valid input");
                break;


        }


    }
}
