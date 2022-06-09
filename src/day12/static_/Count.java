package day12.static_;

public class Count {

    public int x; // instance field
    public static int y; // static field --정적

    public void m1() { // instance method
        System.out.println("x = " + x); // this.x (c1 or c2)
        System.out.println("y = " + y); // this.y unnecessary (same for both c1 and c2)
    }

    // static blocks can only access static fields and methods
    // static block cannot use 'this'
    public static void m2(Count ccc) { // static method
        // 객체 생성 없이 사용되는 static method, so you don't know which this.x it is
        Count c = new Count();
        System.out.println("x = " + c.x);
        System.out.println(ccc.x);
        System.out.println("y = " + y);
    }

}
