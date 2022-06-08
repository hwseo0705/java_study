package day11.inherit;

public class Mage extends Player{

    public int mana; // 마력 게이지

    public Mage(String name) {
        super(name);
        this.mana = 100;
    }

    public void blizzard() {
        System.out.println(name + "님 눈보라 마법 시전!");
    }

    @Override // checks overriding rule
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + mana);
    }
}
