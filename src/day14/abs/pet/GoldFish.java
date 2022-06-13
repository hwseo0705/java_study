package day14.abs.pet;

public class GoldFish extends Pet { // subclasses should have parents' methods when extending

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void feed() {

    }

    @Override
    public void takeNap() {

    }
}
