package day10.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Grandeur");

        // myCar.speed = 30000; // should not be allowed
        // myCar.mode = 'F'; // should not be allowed

        myCar.setSpeed(100);
        System.out.println("Current Speed : " + myCar.getSpeed());

        myCar.setMode('S');
        System.out.println("Current Mode : " + myCar.getMode());
    }
}
