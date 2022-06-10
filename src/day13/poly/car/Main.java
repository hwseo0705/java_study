package day13.poly.car;

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
        seo.buyCar("Grandeur");
        seo.buyCar("Genesis");

    }
}
