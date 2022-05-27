package day08.player;

public class Main {
    public static void main(String[] args) {
        Player Seo = new Player("Haewon", 1, 50);
        Player Kang = new Player("June", 1, 50);

        Seo.attack(Kang);
        System.out.println("--------------------------------");
        Kang.attack(Seo);
        System.out.println("--------------------------------");
        Seo.attack(Seo);
    }
}
