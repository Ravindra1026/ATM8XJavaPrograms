package Practice.FunctionsInJava;

import java.util.Scanner;

public class Swap2Nos {
    public static void swap(int[] numbers){
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int [] numbers = {firstNumber , secondNumber};
        System.out.println("Before swapping: First number = " + numbers[0] + " Second number = " + numbers[1]);

        swap(numbers);

        System.out.println("After swapping: First number = " + numbers[0] + " Second number = " + numbers[1]);


    }
}
