package day07.com.kh.example.practice6.run;

import day07.com.kh.example.practice6.model.vo.Book;

public class Run {
    public static void main(String[] args) {
        Book book = new Book("Hello World", "Julie Print Co.", "Haewon", 30000, 0.4);
        book.inform();
    }
}
