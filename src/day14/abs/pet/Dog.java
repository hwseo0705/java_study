package day14.abs.pet;

public class Dog extends Pet {
    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void feed() {
        System.out.println("강아지는 사료를 먹어요.");
    }

    @Override
    public void takeNap() {
        System.out.println("강아지는 마당에서 낮잠을 자요.");
    }

    /*
    // 낮잠 자는 기능 오버라이딩을 잊었다.
    // 밥 먹는 기능을 오버라이딩 했다.
    public void eat() {
        System.out.println("강아지는 사료를 먹어요.");
    }
     */
}
