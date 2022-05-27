package day08.modi.pac1;

public class B { // same package as A --> if u wanna set restrictions, make it default/private

    // overloading condition: parameter type, order, number must be different

    public B(String s) {
    }

    B(int i) {
    }

    private B(double d) {
    }

    B b1 = new B("Julie");
    B b2 = new B(25);
    B b3 = new B(168.00);

    void test() {
        A a = new A();
        a.f1 = 10; // f1 -> public (universe)
        a.f2 = 20; // f2 -> default (same package)
        // a.f3 = 30; // f3 -> private (same class)

        a.m1(); // public
        a.m2(); // default
        // a.m3(); // private

        // package-private : other classes in the same package can access

    }
}
