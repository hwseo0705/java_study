package day15.interface_;

public class Dog extends Animal implements Pet {

    @Override
    public void play() {
        System.out.println("A dog wiggles its tail~");
    }

    @Override
    public void eat() {
        System.out.println("A dog is eating! Nom~ Nom~");
    }
}
