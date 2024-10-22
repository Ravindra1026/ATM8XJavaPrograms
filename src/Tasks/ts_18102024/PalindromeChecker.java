package Tasks.ts_18102024;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        str = str.toLowerCase();
        String orgStr = str;
        String reversed = "";

        for (int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        if(orgStr.equals(reversed)){
            System.out.println(orgStr + " is Palindrome String");
        }
        else {
            System.out.println((orgStr + " is not a Palindrome String"));
        }


    }
}
