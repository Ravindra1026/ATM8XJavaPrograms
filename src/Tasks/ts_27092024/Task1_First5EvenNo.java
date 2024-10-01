package Tasks.ts_27092024;

public class Task1_First5EvenNo {
    public static void main(String[] args) {

        int count = 0;
        int number = 2;

        do {
            if (number % 2 == 0){
                System.out.println(number);
                count++;
            }
            number++;
        }
        while(count<5);


    }
}
