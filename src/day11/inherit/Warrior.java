package day11.inherit;

// Sub Class -> Child
public class Warrior extends Player {

    public int rage;

    public Warrior(String name) {
        super(name); // Calling Player Constructor
        System.out.println("Warrior Constructor Called");
    }

    public void rush() {
        System.out.println(name + "님이 돌진합니다.");
    }

    @Override // checks overriding rule
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage : " + rage);
    }
}
