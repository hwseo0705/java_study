package day17.generic;

// generic class : the type is defined when the object is created
// generic class type ensures safety by taking in a single type for that specific instance
// 'F extends Fruit' means you can only set type that extends Fruit
public class Basket<F extends Fruit> { // must use generic type : ex) 'F'

    // fields
    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
