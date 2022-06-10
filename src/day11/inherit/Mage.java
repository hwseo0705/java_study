package day11.inherit;

import utility.Util;

public class Mage extends Player {

    public int mana; // 마력 게이지

    public Mage(String name) {
        super(name);
        this.mana = 100;
    }

    public void blizzard() {
        System.out.println("# " + name + "님 눈보라 마법 시전!");
        Util.line();
    }

    public void blizzard(Player... players) {
        blizzard();
        for (Player player : players) {
            if (player == this) continue;
            int damage = (int) (Math.random() * 6 + 10);
            System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n", player.name, damage, player.hp -= damage);
        }
        System.out.println();
    }

    @Override // checks overriding rule
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + mana);
    }
}
