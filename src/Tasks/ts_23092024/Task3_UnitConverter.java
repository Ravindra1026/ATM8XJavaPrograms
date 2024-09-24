package Tasks.ts_23092024;

import java.util.Scanner;

public class Task3_UnitConverter {
    public static void main(String[] args) {
        //Write a program that converts between different units
        // (e.g., kilometers to miles, Celsius to Fahrenheit) based on user
        // selection using a switch statement.
        //Input. -
        //choice - 1 - km → m, km → 1km
        //choice - 2 - f → c, f → c
        // Variable declaration
        int Choice;
        double input, result;
        //scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select conversion Type");
        System.out.println("1 - Kilometer to Mile");
        System.out.println("2 - Fahrenheit to Celsius");
        //user input
        System.out.println("Enter your choice (1 or 2): ");
        Choice = scanner.nextInt();

        switch (Choice){
            case 1:
                System.out.println("Enter distance in Kilometer: ");
                input = scanner.nextDouble();
                result = input * 0.621371;
                System.out.println(input + " Kilometer is " + result + " miles");
                break;

            case 2:
                System.out.println("Enter the temperature in degree celsius: ");
                input = scanner.nextDouble();
                result = (input*9/5) + 32;
                System.out.println(input + " Celsius is " + result + " Fahrenheit");
                break;

            default:
                System.out.println("Error: Enter valid choice");
                break;

        }







    }
}
