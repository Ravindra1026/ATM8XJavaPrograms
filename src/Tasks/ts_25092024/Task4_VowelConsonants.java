package Tasks.ts_25092024;

import java.util.Locale;
import java.util.Scanner;

public class Task4_VowelConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        System.out.println("Enter the string: ");
        s = scanner.next();
        s = s.toLowerCase();
        int vowelCount = 0;
        int consonantsCount = 0;

        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            } else if (ch >= 'a' &&  ch <= 'z') {
                consonantsCount++;
            }
        }
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants: " + consonantsCount);



    }
}
