package day15.interface_;

// 인터페이스로 필드 상속이 불가능 하기에, abstract class와 함께 사용
public abstract class Animal {
    
    public String name;
    public int age;

    public abstract void eat();
}
