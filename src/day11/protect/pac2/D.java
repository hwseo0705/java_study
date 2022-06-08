package day11.protect.pac2;

import day11.protect.pac1.A;

// use 'protected' when you want to restrict access from other packages but
// allow other classes from different packages to have access when extended
public class D extends A {

    public D() {
        super();
        // super(30.0) --> default so does not work

        A a = new A();
//        a.f1 = 2; // protected, but no

        // Different Package, Extends A
        // can access public and protected, not default
        super.f1 = 2; // protected
        // super.f2 = 2; // default
        super.m1(); // protected
//        super.m2(); // default
    }
}
