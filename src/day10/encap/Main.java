package day10.encap;

public class Main {
    public static void main(String[] args) {
/*        Car myCar = new Car("Grandeur");

        // myCar.speed = 30000; // should not be allowed
        // myCar.mode = 'F'; // should not be allowed



        myCar.setSpeed(100);
        System.out.println("Current Speed : " + myCar.getSpeed());

        myCar.setMode('S');
        System.out.println("Current Mode : " + myCar.getMode());*/
        Car car = new Car("소나타");

        // 시동 걸기 -> 엔진오일 순환 -> 연료 주입 -> 실린더 작동
        // if the driver has to manually do these, too much work
        // so you make all the methods private, except for engineStart()
        car.engineStart();
        car.setMode('D');
        car.setSpeed(100);
        car.engineStop();

    }
}
