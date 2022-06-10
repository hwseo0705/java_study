package day13.poly.overloading;

// OVERLOADING
// return type and access modifier does not have to be the same
// must have same method name, different parameters (order, type, number)

public class Rectangle {

//    private int width;
//    private int height;

    // 정사각형의 넒이를 구하는 기능
    // calcArea(int)
    public int calcArea(int len) {
        return len * len;
    }

    // 직사각형의 넓이를 구하는 기능
    // calcArea(int, int)
    public int calcArea(int w, int h) {
        return w * h;
    }

    // calcArea(int) already exists, but works if you make it calcArea(double)
    public int calcArea(double d) {
        return 0;
    }

    // calcArea(int, String)
    public int calcArea(int a, String b) {
        return 0;
    }

    // calcArea(String, int)
    // same parameters but different order
    public int calcArea(String a, int b) {
        return 0;
    }

    // calcArea(int) already exists
    // return type does not matter so this won't work
    // access modifier also does not affect it
    // public void calcArea(int b) {}
    // private void calcArea(int b) {}

}
