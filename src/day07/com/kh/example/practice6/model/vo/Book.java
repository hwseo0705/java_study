package day07.com.kh.example.practice6.model.vo;

public class Book {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public Book() {
    }

    public Book(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = 100;
        this.discountRate = 0.2;
    }

    // alt + insert --> creates for you
    public Book(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public void inform() {
        System.out.println("제목: " + title);
        System.out.println("출판사: " + publisher);
        System.out.println("작가명: " + author);
        System.out.println("가격: " + price);
        System.out.println("할인율: " + discountRate);
        System.out.println();
    }
}
