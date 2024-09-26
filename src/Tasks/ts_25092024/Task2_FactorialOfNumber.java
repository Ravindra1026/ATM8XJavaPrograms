package Tasks.ts_25092024;

import java.util.Scanner;

public class Task2_FactorialOfNumber {
    public static void main(String[] args) {
        // input num;
        //3*2*1 = 6
        int num;
        long factorial = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find Factorial: ");
        num = scanner.nextInt();
        for(int i=1; i<=num; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);

    }
}
