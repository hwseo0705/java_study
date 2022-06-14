package day15.exception;

public class Main {

    public static void main(String[] args) { // do not throw exception in main

        try {
            int n = EasyScanner.inputInteger("int: ");
            double v = EasyScanner.inputFloat("float: ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
