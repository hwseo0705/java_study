package day14.practice3.controller;

import day14.practice3.model.vo.Animal;
import day14.practice3.model.vo.Cat;
import day14.practice3.model.vo.Dog;

public class AnimalManager {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        for (int i = 0; i < animals.length; i++) {
            int random =  (int) (Math.random() * 2);
            if (random == 1) animals[i] = new Dog("멍멍", "멍멍", 10);
            else animals[i] = new Cat("냥냥", "냥냥", "서울", "흰색");
            animals[i].speak();
        }
    }
}
