package Practice.FunctionsInJava;

import java.util.Scanner;

public class AdditionUsingFunction {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the Second number: ");
        b = scanner.nextInt();

        int sum = add(a,b);
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }
    public static int add(int a, int b){
        return a+b;
    }
}
