package day13.poly.car;

import utility.Util;

public class Main {
    public static void main(String[] args) {
        Car g1 = new Grandeur();
        Car g2 = new Grandeur();
        Grandeur g3 = new Grandeur();

        Car m1 = new Mustang();
        Mustang m2 = new Mustang();

        Car s1 = new Stinger();
        Stinger s2 = new Stinger();

        // 자동 형변환 : automatic upcasting when going into the 'Car' array
        Car[] cars = {g1, g2, g3, m1, m2, s1, s2};
        for (Car car : cars) {
            car.run();
        }

        // this is possible, but not recommended
        Object[] obj = {10, 3.3, "Haewon", new Mustang(), true, 'D'};

        System.out.println("-----------------------------------------------");
        Driver seo = new Driver();
//        seo.driveMustang(new Mustang());
//        seo.driveGrandeur(new Grandeur());
        seo.drive(new Mustang());
        seo.drive(new Grandeur());

        System.out.println("-----------------------------------------------");
        Car myCar = seo.buyCar("Grandeur");
        myCar.run();
        seo.buyCar("Mustang").run(); // run is void, chaining ends
//        new Driver().buyCar("").run(); // yea idk
        seo.drive(seo.buyCar("Stinger"));
        seo.buyCar("Genesis");

        System.out.println("-----------------------------------------------");
        // mm and cc are have the same address
        Mustang mm = new Mustang();
        Car cc = mm; // upcasting : automatic
        // down-casting : problematic --> must use (Mustang)
        mm = (Mustang) cc; // why do this? idk but is possible

        // ClassCastException
        // down-casting parent class with child object is possible //
        // but you cannot down-cast a parent class with parent object //
        // Car ccc = new Car();
        // Mustang mmm = (Mustang) ccc;

        System.out.println("----------------------------------------");
        // myTang is not 'Mustang' it's 'Car'
        // so you cannot use 'Mustang's' methods
        // myTang.joinMustangClub(); // -> so you downcast
        Car myTang = seo.buyCar("Mustang");
        myTang.run();
        ((Mustang) myTang).joinMustangClub();

        // Alternative
        // although buyCar returned 'Car', the object in 'Car' is 'Mustang'
        // this is why you can downcast 'Car' to 'Mustang'
        // if the 'Car' has 'Car' object, then down-casting to 'Mustang' is not allowed
        Mustang tang = (Mustang) seo.buyCar("Mustang");
        tang.run();
        tang.joinMustangClub();

        Util.line(); // prints line
        int i = Util.inputN("정수: "); // scanner in utility
        System.out.println(i);
    }
}
