package day07;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        String str1 = "가나다";
        Scanner sc = new Scanner(System.in);
        String str2 = sc.next();
        sc.close();

        // str1 == str2 --> returns false
        // cuz this is comparing the addresses that str1 and str2 contains
        // which is the address where the actual String value is
        // == compares addresses, equals compares string value;
        if (str1.equals(str2)) {
            System.out.println("두 문자열이 일치함");
        } else {
            System.out.println("두 문자열이 일치하지 않음");
        }
    }
}
