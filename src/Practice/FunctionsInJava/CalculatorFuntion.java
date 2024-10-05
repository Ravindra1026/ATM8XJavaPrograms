package Practice.FunctionsInJava;

import java.util.Scanner;

public class CalculatorFuntion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the Second number: ");
        double b = scanner.nextDouble();
        System.out.println("Select Operation you want to perform (+, -, *, /, %)");
        char operation = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operation){
            case '+':
                result = add(a,b);
                break;
            case '-':
                result = subtract(a,b);
                break;
            case '*':
                result = multiply(a,b);
                break;
            case '/':
                result = divde(a,b);
                break;
            case '%':
                result = modulus(a,b);
                break;
            default:
                System.out.println("Invalid Operation!");
                validOperation =false;
                break;
        }
        if(validOperation){
            System.out.println("Result is " + result);
        }
    }
    //Function for addtion
    public static double add(double a, double b){
        return  a+b;
    }
    public static double subtract(double a, double b){
        return a-b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static double divde(double a, double b){
        return a/b;
    }
    public static double modulus(double a, double b){
        return a%b;
    }
}
