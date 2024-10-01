package Tasks.ts_27092024;

public class Task3_DoWhileSum {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        do{
            sum += i;
            i++;
        }
        while(i<=100);
        System.out.println("Sum of first 100 no is: " + sum);
    }
}
