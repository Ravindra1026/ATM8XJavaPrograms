package Tasks.ts_23092024;

import java.util.Scanner;

public class Task2_MonthsName {
    public static void main(String[] args) {

        int num;
        String month = "";
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-12): ");
        num = scanner.nextInt();
        //Performing operation based on user input
        switch (num){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.println("Error: Enter a number between 1 and 12");
                return;

        }
        System.out.println("The month is " + month);


    }
}
