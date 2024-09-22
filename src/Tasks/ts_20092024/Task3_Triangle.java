package Tasks.ts_20092024;

public class Task3_Triangle {
    public static void main(String[] args) {

        int side1 = 5;
        int side2 = 5;
        int side3 = 3;

        if ((side1==side2) && (side1==side3) && (side2==side3)){
            System.out.println("Triangle is equilateral triangle");
        } else if ((side1==side2) || (side1==side3) || (side2==side3)) {
            System.out.println("Triangle is isosceles triangle");
        }
        else {
            System.out.println("Triangle is Scalene triangle");
        }
    }
}
