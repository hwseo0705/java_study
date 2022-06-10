package day13.poly.basic;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class Poly {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 'a' is 'b's parent
        // types r different but
        // these are all possible
        a = b;
        A x1 = b;
        A x2 = new B();
        A x3 = c;
        A x4 = new D();
        A x5 = e;
        
        B y1 = new D();
        C y2 = new E();
        
        // 상속관계가 아님
        // this will not work
        // B y3 = new E();
        // D y4 = new E();

        //////////////////// Polymorphism ////////////////////
        // E --> E, C, A, Object
        // it doesn't work the other way : ex) B z = new A();
        //////////////////////////////////////////////////////

        // type is different but
        // the bigger one (parent) can take in
        // the smaller one (child)
        double dd = 3.3;
        int nn = (int) dd;
        dd = nn;
    }
}