package day11.protect.pac2;

import day11.protect.pac1.A;

public class C {

    public C() {
        // Different Package
        // can only access public
        A a = new A(); // public
//        A a1 = new A(3); // protected
//        A a2 = new A(3.3); // default


    }
}
