package day08.modi.pac2;

import day08.modi.pac1.A;
import day08.modi.pac1.B;

public class C { // different package as A
    void test() {
        A a = new A();

        a.f1 = 10; // public
        // a.f2 = 20; // default
        // a.f3 = 30; // private

        a.m1(); // public
        // a.m2(); // default
        // a.m3(); // private
    }

    B b1 = new B("Julie"); // public
    // B b2 = new B(25); // default
    // B b3 = new B(168.00); // private
}
