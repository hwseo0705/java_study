package day13.poly.overloading;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.calcArea(5 ));
        System.out.println(r.calcArea(10, 20));

        r.calcArea("", 1);

        // 'System' class has static field 'PrintStream out'
        // 'PrintStream out' has a public method println()
        System.out.println(); // also overloading println(), println(int), ...
    }
}
