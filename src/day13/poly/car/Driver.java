package day13.poly.car;

public class Driver {

    // polymorphism
    public void drive(Car c) {
        System.out.println("Start Driving");
        c.run();
    }

    public Car buyCar(String carName) {
        switch (carName) {
            case "Stinger":
                System.out.println("Buying Stinger");
                return new Stinger();
            case "Grandeur":
                System.out.println("Buying Grandeur");
                return new Grandeur();
            case "Mustang":
                System.out.println("Buying Mustang");
                return new Mustang();
            default:
                System.out.println("N/A");
                return null;
        }
    }

//    public void driveMustang(Mustang m) {
//        System.out.println("Start Driving");
//        m.run();
//    }
//
//    public void driveGrandeur(Grandeur g) {
//        System.out.println("Start Driving");
//        g.run();
//    }
}
