package day12.static_;

public class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.x = 10;
        c1.x++;

        c1.y = 20;
        // you can do this but not necessary
        // c1.y--;
        Count.y--;

        System.out.printf("c1.x: %d, c1.y: %d\n", c1.x, c1.y);

        Count c2 = new Count();
        // since 'y' is static, it will show '19', the value set by c1
        // even if we are printing c2.y --> static : shared among all
        System.out.printf("c2.x: %d, c2.y: %d\n", c2.x, c2.y);

        // PI is static, so you can call by using class name
        System.out.println(Math.PI);

        System.out.println("-------------------------------------------------");
        c1.m1(); // will get c1's x
        c2.m1(); // will get c2's x
        // Count.m2(); // which 'x' (?)
        Count.m2(c2);

    }
}
