package day08.player;

public class Player {
    String name;
    int level;
    int hp;

    public Player() {
        // since you can only call Player() when it is being created
        // you can call the Player(3 params) constructor with 'this'
        // this() always has to be on TOP!!
        this("No_Name");
        System.out.println("First Constructor");
    }

    public Player(String name) {
        this(name, 1, 50);
        System.out.println("Second Constructor");
    }
    public Player(String name, int level, int hp) {
        System.out.println("Third Constructor");
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    // always have 'Player this', itself as a parameter
    // even if you do not explicitly mention it
    // in 'this' case, you don't have to pass in 2 arguments, only 1
    void attack(Player this, Player target) {
        if (this == target) { // don't have to compare name, if address is the same, the same
            System.out.println("You cannot attack yourself");
            return;
        }

        // print: x is attacking y
        System.out.printf("%s이(가) %s을(를) 공격합니다.\n", this.name, target.name);
        // opponent hp -= 10, my hp += 5
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("My HP: %d, Opponent's HP: %d\n", this.hp, target.hp);

    }

    // Player Info Print
    void info() {
        System.out.printf("Name: %s, Level: %d, HP: %d\n", name, level, hp);
    }
}
