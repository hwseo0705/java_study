package day11.protect.pac1;

public class B {

    public B() {
        // Same Package
        A a = new A();

        // can access protected and default
        a.f1 = 1;
        a.f2 = 2;
        a.m1();
        a.m2();
        new A(2);
        new A(3.3);
    }
}
