package day03;

public class Loop02 {
    public static void main(String[] args) {
        // labeling
        apple: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                if (lower == 'f') break apple; // terminates the loop 'apple'
                System.out.printf("%c - %c\n", upper, lower);
            } // inner for
            if (upper == 'D') break;
        } // outer for
    } // end main
} // end class
