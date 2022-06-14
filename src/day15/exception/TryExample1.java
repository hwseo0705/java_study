package day15.exception;

public class TryExample1 {

    public static void main(String[] args) {
        int n1 = 10, n2 = 0;
        System.out.println("Start Division");
        try { // Exception Handling
            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
        } catch (ArithmeticException e) { // can also use 'Exception e'
            System.out.println("cannot be divided by zero");
            e.printStackTrace(); // Exception Log
            System.out.println(e.getMessage()); // prints exception : '/ by zero'
        } finally {
            System.out.println("Program Exit (0)");
        }
    }
}
