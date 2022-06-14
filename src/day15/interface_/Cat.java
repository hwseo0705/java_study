package day15.interface_;

public class Cat extends Animal implements Pet {

    @Override
    public void play() {
        System.out.println("A cat is on the cat tower~");
    }

    @Override
    public void eat() {

    }
}
