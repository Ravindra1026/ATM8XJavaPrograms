package Tasks.ts_18102024;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String reversed = "";

        for(int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);

        }
        System.out.println("Reversed string " + reversed);
    }
}
