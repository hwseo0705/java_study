package day14.abs.pet;

import utility.Util;

public class Main {
    public static void main(String[] args) {
        // 'Pet' class is 'abstract', so its' instance cannot be created
        // it can still be like this...
        Pet dog = new Dog("초코", "푸들", 3);
        Pet cat = new Cat("냥냥이", "러시안블루", 2);

        dog.feed();
        dog.takeNap();

        Util.line();

        cat.feed();
        cat.takeNap();
    }
}
