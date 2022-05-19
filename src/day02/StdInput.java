package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdInput {
    public static void main(String[] args) throws IOException {
//        int inputData = System.in.read();
//        System.out.println(inputData);

        // Scanner API
        Scanner sc = new Scanner(System.in);

        /*
            - next() : no space
            - nextLine() : space allowed
            - nextInt() : integer
            - nextDouble() : double
        */
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.println("name = " + name);

        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.println("age + 10 = " + (age + 10));

        // Clear Scanner
        sc.close();
    }
}