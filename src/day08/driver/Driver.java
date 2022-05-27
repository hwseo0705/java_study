package day08.driver;

import day08.car.Car;
import day08.car.Dealer;

public class Driver {
    Car myCar;

    void drive() {
        myCar.startCar();
        // myCar.engineOil(); // this is dangerous, so make it private
        // myCar.v6Engine = new Engine(); // driver cannot change engine
    }

    void buyCar(Dealer niceDealer) {
        // myCar = new Car(); // drivers cannot make their own car -> default
        niceDealer.sellCar(100000000);
    }
}
