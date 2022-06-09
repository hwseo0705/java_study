package day12.static_;

public class Calculator {

    public String company;
    public String color;
    public static double PI; // static cuz PI is same for all

    // static initializer -- initializes static data
    // only called once!!!
    static {
        System.out.println("!!!!!!! Static Initializer !!!!!!!");
        PI = 3.141592;
    }

    public Calculator(String company, String color) {
        this.company = company;
        this.color = color;
//        this.PI = 3.141592;
    }

    public void color(String color) {
        this.color = color;
    }

    public static double circleWidth(int r) {
        return PI * r * r;
    }

    public static void main(String[] args) {
        double width = Calculator.circleWidth(3);

        // static initializer only called once
        System.out.println("PI: " + Calculator.PI);
        System.out.println("PI: " + Calculator.PI);
        System.out.println("PI: " + Calculator.PI);
        System.out.println("PI: " + Calculator.PI);
        System.out.println("PI: " + Calculator.PI);

        Calculator sharp = new Calculator("Samsung", "Grey");
        sharp.color("red");
        // PI is only 3.14 when the object is already created (sharp)
        // if PI is initialized in constructor, that's why you use
        // static initializer to have the PI value without creating the object
        System.out.println("PI: " + Calculator.PI); // PI is static
    }
}
