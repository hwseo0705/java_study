package day07.com.kh.example.practice6.run;

import day07.com.kh.example.practice6.model.vo.Book;

public class Run {
    public static void main(String[] args) {
        Book book0 = new Book();
        book0.inform();
        Book book3 = new Book("Nice", "HeHe", "Julie");
        book3.inform();
        Book book5 = new Book("Hello World", "Julie Print Co.", "Haewon", 30000, 0.4);
        book5.inform();
    }
}
