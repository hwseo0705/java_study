package day07;

public class FieldVariable {
    int a; // field --> heap

    /*
        Local variables MUST be initialized in order to be used
        Fields are automatically initialized to default even if it's not explicitly done
        Parameters are passed when the methods are called so don't need initialization
    */

    void m1(int c) { // c : parameter --> stack
        int b = 1; // local variable --> stack
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public static void main(String[] args) {
        // since 'm1' is not static, you have to make
        // an instance of this class to call the method
        FieldVariable fv  = new FieldVariable();
        fv.m1(10);
        System.out.println(fv.a);
    }
}
