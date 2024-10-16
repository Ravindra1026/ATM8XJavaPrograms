package Tasks.ts_14102024;

public class PrintMyBook extends Book {

    @Override
    void getDetails() {
        System.out.println(name + " " + author+" " + price);
    }

    public PrintMyBook(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;

    }

}
