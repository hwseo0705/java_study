package day08.car;

public class Mechanic {
    void changeEngine(Car fixCar) {
        fixCar.v6Engine = new Engine(); // mechanic should be able to change engine
    }
}
