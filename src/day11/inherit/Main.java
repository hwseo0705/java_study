package day11.inherit;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior("Keyboard Warrior");
        Mage m = new Mage("Lightening Thunder");
        Hunter h = new Hunter("Dog Hunter");

        w.level = 10;
        w.showStatus();
        m.showStatus();
        h.showStatus();

        w.exp = 100;
        m.exp =50;
        h.exp = 200;

//        m.blizzard();

        w.equals(m);
    }
}
