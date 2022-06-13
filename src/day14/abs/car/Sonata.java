package day14.abs.car;

// if the 'Car' class is not abstract,
// even if the 'Sonata' class does not have necessary methods,
// it does not throw you an error
public class Sonata extends Car{

    @Override
    public void accel() {

    }

    @Override
    public void brake() {

    }
}
