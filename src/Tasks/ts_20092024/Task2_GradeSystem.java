package Tasks.ts_20092024;

public class Task2_GradeSystem {
    public static void main(String[] args) {
        int score = 65;
        String grade = (score>=90)? "A": ((score>=80)? "B": "C");
        System.out.println(grade);
    }
}
