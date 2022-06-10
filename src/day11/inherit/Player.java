package day11.inherit;

// Super Class --> Parent
// 공통 기능과 속성을 기술
public class Player extends Object { // All classes always extend Object class

    public String name; // character name
    public int level;
    public int hp;
    public int exp;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 50;
        // System.out.println("Player Constructor Called");
    }

    public void showStatus() {
        System.out.println("\n======= Character's Info =======");
        System.out.println("# name : " + name);
        System.out.println("# level : " + level);
        System.out.println("# hp : " + hp);
    }
}
