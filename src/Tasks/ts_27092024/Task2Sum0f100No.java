package Tasks.ts_27092024;

public class Task2Sum0f100No {
    public static void main(String[] args) {
        //With while loop

        int sum = 0;
        int i = 1;
        while(i<=100){
            sum = sum + i;
            i++;
        }
        System.out.println("The Sum of first 100 numbers is: " + sum);

    }
}
