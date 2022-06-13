package day14.abs.car;

public abstract class Car {

    public abstract void accel();

    public abstract void brake();

    // not all methods gotta be abstract
    // final : cannot change anywhere
    // if not final, they can use/override
    public /* final */ void heatHandle() {
        System.out.println("온도가 10도까지 올라갑니다.");
    };

}
