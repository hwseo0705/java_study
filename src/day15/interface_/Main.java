package day15.interface_;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // 인터페이스도 다형성을 적응할 수 있다.
        // Animal - abstract, Pet - interface
        Pet dog = new Dog();
        Pet cat = new Cat();
        Shark shark = new Shark();
        Tiger tiger = new Tiger(); // can do Violent tiger = new Tiger();
        Bulldog bulldog = new Bulldog();
        Rabbit rabbit = new Rabbit();

        Pet[] pets = {dog, cat, bulldog, rabbit};
        for (Pet pet : pets) {
            pet.play();
        }

        Violent[] violents = {rabbit, tiger, shark};
        for (Violent v : violents) {
            v.attack("zzz");
        }

        // 인터페이스를 통해 객체의 기능을 제한할 수 있다.
        // if you change Rabbit to Pet or Violent,
        // you cannot access play or attack
        Rabbit tokki = new Rabbit();
        tokki.play();
        tokki.attack("owner");

        // when it's 'List', you can add in the middle
        // when it's 'Queue', you cannot add in the middle
        // Since 'LinkedList' is implementing 'List' and 'Queue'
        // you can restrict what that 'LinkedList' can do by assigning differently
        List<Integer> list = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
    }
}
