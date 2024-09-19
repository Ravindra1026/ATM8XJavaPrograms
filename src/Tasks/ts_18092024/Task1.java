package Tasks.ts_18092024;

public class Task1 {
    public static void main(String[] args) {
        //Widening - Implicit
        byte a = 15;
        int b = a;
        System.out.println(b);
        //Widening - Explicit
        int b1 = (int)a;
        System.out.println(b1);

        //Narrowing - Implicit
        int c = 145;
      //  byte d = c;
        // Narrowing - Explicit
        byte d1 = (byte)c;
        System.out.println(d1);


    }
}
