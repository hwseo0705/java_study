package day02;

public class BitOperator {
    public static void main(String[] args) {
        // bit operator
        byte a = 5; // 0000 0101
        byte b = 3; // 0000 0011

        // & (bit multiply)
        System.out.println(a & b); // 0000 0001
        // | (bit add)
        System.out.println(a | b); // 0000 0111
        // ^ (same 0, diff 1)
        System.out.println(a ^ b); // 0000 0110

        System.out.println("----------------------------------------");

        // bit shift -- I finally get it now lmao
        // << : shift left : 2의 이동숫자만큼 제곱으로 곱해라
        // >> : shift right : 2의 이동숫자만큼 제곱으로 나눠라

        // 00000000 00000000 00000000 11000000
        int x = 192;
        // 00000000 00000000 00000110 00000000
        System.out.println(x << 3); // 192 * (2^3)
        // 00000000 00000000 00000000 00110000
        System.out.println(x >> 2); // 192 * (2^-2)

        System.out.println("----------------------------------------");

        // bit flip
        int y = 8; // 0000 1000
        System.out.println(~y); // 1111 0111 --> -9
        System.out.println(~y + 1); // -8
    }
}
