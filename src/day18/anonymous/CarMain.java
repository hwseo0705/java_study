package day18.anonymous;

public class CarMain {
    public static void main(String[] args) {

        // anonymous
        Car avante = new Car() {
            @Override
            public void run() {
                System.out.println("Avante is running");
            }
        }; // 'Car' is an interface!! but you can create an anonymous class

        // works as if the 'avante' object is created
        avante.run();

        // lambda : is so great!!!! :)
        Car grandeur = () -> System.out.println("Grandeur is running");
        grandeur.run();

        Car tucson = () -> System.out.println("Tucson is running");
        tucson.run();

        Calculator addCal = (f, s) -> f + s; // operate의 재정의
        addCal.operate(10, 20);
    }
}
