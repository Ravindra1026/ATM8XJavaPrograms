package Practice.FunctionsInJava;

import java.util.Scanner;


public class SquareOfNumber {
    public static int square(int num){
        return num*num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Square of " + num + " is " + square(num) + ".");
    }
}
