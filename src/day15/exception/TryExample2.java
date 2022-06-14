package day15.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ctrl + alt + t
        try {
            System.out.print("Num 1: ");
            int n1 = sc.nextInt(); // InputMismatchException - input not int
            // NoSuchElementException (out of range), IllegalStateException (scanner closed)

            // Exception Unknown Message
            // sc.close();

            System.out.print("Num 2: ");
            int n2 = sc.nextInt(); // InputMismatchException - input not int

            int div = n1 / n2; // ArithmeticException - n2 is 0
            System.out.println("div = " + div);

            // sc = null;
            sc.close(); // NullPointerException - sc is null
        } catch (InputMismatchException e) {
            System.out.println("enter a number");
            // throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            System.out.println("cannot be divided by zero");
        } catch (NullPointerException e) {
            System.out.println("check if the object is empty");
        } catch (Exception e) { // this is like an else statement, cannot throw other exceptions after
            System.out.println("Exception Unknown");
        }
        System.out.println("Program Exit (0)");
    }
}
