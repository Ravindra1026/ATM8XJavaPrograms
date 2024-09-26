package Tasks.ts_25092024;

import java.util.Scanner;

public class Task1_TableOfNumber {
    public static void main(String[] args) {
        //input num =;
        // output 2*1=2
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }


    }
}
