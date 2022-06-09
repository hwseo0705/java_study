package day12.final_;

// can have multiple classes in one file, but can't be public
// cannot extend final class
class Child extends Parent {

    // since m1 is final, no override
//    @Override
//    void m1() {
//        super.m1();
//    }

    void m4() {
    }

}

// only the one with the file name can be public
public /* final */ class Parent {

    final void m1() { // overriding not allowed
    }

    void m2() {
    }

    void m3() {
    }

}
