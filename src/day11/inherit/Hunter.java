package day11.inherit;

public class Hunter extends Player {

    public int arrow; // 화살 수
    
    public Hunter(String name) {
        super(name);
        this.arrow = 1000;
    }
    
    public void blazeShot() {
        System.out.println(name + "님이 폭발 화살을 시전합니다.");
    }

    @Override // checks overriding rule
    public void showStatus() {
        super.showStatus();
        System.out.println("# arrow : " + arrow);
    }
}
