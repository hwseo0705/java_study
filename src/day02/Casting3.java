package day02;

public class Casting3 {
    public static void main(String[] args) {
        // two data with different types
        // cast the smaller one to bigger one (upcast)
        int a = 10;
        short b = 30;
        int c = a + b;

        // String + int = String, but char + int = int
        char d = 'A';
        int e = 2;
        System.out.println(d + e);

        // if you want to print the char value of d + e
        // down-cast
        char f = (char) (d + e);
        System.out.println("f = " + f);

        System.out.println(5.0 + 3);

        // why is b1 + b2 an int?
        // math between data smaller than int (byte, short, char) will
        // automatically give an int result to prevent overflow/underflow
        // ex) '*' instead of '+' will give a big value, so in case of that
        //      happening, java will automatically make it larger :)
        byte b1 = 100;
        byte b2 = 20;
        int result = b1 + b2;
        System.out.println('A' + 'B');
        System.out.println("A" + "B");
    }
}
