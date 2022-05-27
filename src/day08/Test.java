package day08;

//import day08.fruit.Apple;
//import day08.fruit.Banana;
//import day08.fruit.Grape;

import day08.fruit.*;

public class Test {
    public static void main(String[] args) {

        // if the class is in another package, you must specify the full name
        day08.syrup.Apple syrup = new day08.syrup.Apple();

        // or you have to import the whole package path
        Apple apple = new Apple();
        Banana banana = new Banana();
        Grape grape = new Grape();

    }
}
