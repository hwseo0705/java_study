package day13.poly.casting;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1(); // parent's
        parent.m2(); // parent's

        System.out.println("----------------------------------------");
        Child child = new Child();
        child.m1(); // parent's
        child.m2(); // override
        child.m3(); // child's

        System.out.println("----------------------------------------");
        Parent child1 = new Child();
        child1.m2(); // override
        // child cannot call its' method if upcasted
        // cuz parent cannot use child's methods
        ((Child) child1).m3(); // child1.m3(); --> upcasting problem
    }
}
