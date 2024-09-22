package Tasks.ts_20092024;

import java.util.Scanner;

public class Task5_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();
        if(year%4==0){
            System.out.println("Entered year is a Leap Year");
        }
        else{
            System.out.println("Entered Year is not a Leap Year");
        }

    }
}
