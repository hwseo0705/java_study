package day15.interface_;


// interface : 객체의 규격을 표준화해서 명세하는 역할
public interface Pet {

    // 인터페이스는 객체화 될 수 없으며, 필드도 가질 수 없음
    // 또한 상수와 추상 메서드만 선언 가능
    // everything in the interface must be public (?)

    // a public static final variable
    String PLAY_GROUND = "park";

    // a public abstract method
    void play();
}
