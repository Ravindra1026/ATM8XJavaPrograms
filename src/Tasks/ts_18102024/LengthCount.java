package Tasks.ts_18102024;

import java.util.Scanner;

public class LengthCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = scanner.next();
        char[] charArray = str.toCharArray();
        int length =0;
        for(char c: charArray){
            length++;
        }
        System.out.println("Length of string is: " + length);
    }
}
