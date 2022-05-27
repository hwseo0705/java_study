package day08.player;

public class Main2 {
    public static void main(String[] args) {

        Player p0 = new Player();
        p0.info();
        System.out.println("--------------------------------------------");
        Player p1 = new Player("Morty");
        p1.info();
        System.out.println("--------------------------------------------");
        Player p2 = new Player("Bojack", 100, 200);
        p2.info();
    }
}
