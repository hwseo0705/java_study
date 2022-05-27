package day08.modi.pac1;

public class A {
    // field
    public int f1;
    int f2; // default
    private int f3;

    // no restrictions inside the class
    // only when you try to access other's

    public A() {
        f1 = 1;
        f2 = 2;
        f3 = 3;
        m1();
        m2();
        m3();
    }

    B b1 = new B("Julie");
    B b2 = new B(25);
    // B b3 = new B(168.00); // private

    // method
    public void m1() {
    }

    void m2() {
    } // default

    private void m3() {
    }
}
