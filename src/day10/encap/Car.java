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
}
