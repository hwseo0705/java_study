package day08.car;

public class Car {
    // has to be default if you don't want the driver
    // to change the engine but the mechanic can
    Engine v6Engine;

    Car() {}

    public void startCar() {
        engineOil();
        moveCylinder();
    }

    void moveCylinder() {
    }

    private void engineOil() {
    }
}
