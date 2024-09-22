package Tasks.ts_20092024;

public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;
        int max = (a>b ? a:b)>c ? (a>b ? a:b):c;

        System.out.println(max);
    }
}
