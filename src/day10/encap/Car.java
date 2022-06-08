package day10.encap;

public class Car {

    private String model;
    private int speed;
    private char mode; // D, N, R, P
    private boolean start;

    public Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

    // setter : method that sets private fields' values
    public void setSpeed(int speed) {
        if (speed < 0 || speed > 200) return;
        this.speed = speed;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'D':
            case 'R':
            case 'N':
            case 'P':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        }
    }

    // getter : method that gets private fields' values
    public int getSpeed() {
        return this.speed;
    }

    public char getMode() {
        return this.mode;
    }

    // method to start the car
    public void engineStart() {
        System.out.println("시동버튼을 눌렀습니다.");
        injectOil();
        injectGasoline();
        this.start = true;
        System.out.println("시동이 걸렸습니다.");
        moveCylinder();
    }

    // 엔진에 연료가 주입되는 기능
    private void injectGasoline() {
        System.out.println("연료가 엔진에 주입됩니다.");
    }

    // 엔진오일이 주입되는 기능
    private void injectOil() {
        System.out.println("엔진 오일이 순환합니다.");
    }

    // 실린더가 움직이는 기능
    private void moveCylinder() {
        if (start) System.out.println("실린더가 움직입니다");
        else System.out.println("차가 고장났습니다.");
    }

    // 시동을 끄는 기능
    public void engineStop() {
        if (this.speed > 0) {
            System.out.println("주행 중에는 시동을 끌 수가 없습니다.");
            return;
        }
        this.start = false;
        System.out.println("시동이 꺼졌습니다.");
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}
