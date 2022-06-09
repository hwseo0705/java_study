package day12.static_.singleton;

public class Main {
    public static void main(String[] args) {
        // called 3 so 3 diff addresses, if new Controller();
        // the following will return the same instance every time
        Controller c1 = Controller.getInstance();
        Controller c2 = Controller.getInstance();
        Controller c3 = Controller.getInstance();

        // in singleton pattern, even though you create 3 objects,
        // the class itself is gonna be static and all will be the same;
        c1.number = 100;
        c2.number = 200;
        c3.number = 300;

        System.out.println("c1.number = " + c1.number);
        System.out.println("c3.number = " + c2.number);
        System.out.println("c3.number = " + c3.number);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
