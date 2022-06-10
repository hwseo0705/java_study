package day13.poly.car;

public class Mustang extends Car {

    @Override
    public void run() {
        System.out.println("Mustang is moving.");
    }

    // Mustang's Method (not inherited)
    public void joinMustangClub() {
        System.out.println("Joining Mustang Club");
    }
}
