package day14.abs.pet;

public class Cat extends Pet {
    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void feed() {
        System.out.println("고양이는 츄르를 먹어요.");
    }

    @Override
    public void takeNap() {
        System.out.println("고양이는 캣타워에서 자요.");
    }

    // 낮잠 자는 기능 오버라이딩을 잊었다.
    // 밥 먹는 기능을 오버라이딩 했다.
    /*
    public void sleep() {
        System.out.println("고양이는 캣타워에서 자요.");
    }
     */
}
