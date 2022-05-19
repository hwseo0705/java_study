package day02;

public class Casting1 {
    public static void main(String[] args) {
        byte a = 100; // 1 byte

        // byte 'a' auto cast to int
        int b = a;

        // int 'b' auto cast to double
        double c = b;
        System.out.println("c = " + c);
    }
}
