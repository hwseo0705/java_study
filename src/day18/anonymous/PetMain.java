package day18.anonymous;

public class PetMain {
    public static void main(String[] args) {

        // anonymous
        Pet dog = new Pet() {
            // this acts as a class!!!!
            // can even declare a variable and everything
            String name;

            @Override
            public void play() {
                System.out.println("The dog is walking.");
            }

            @Override
            public void eat() {
                System.out.println("The dog is eating.");
            }
        };

        // lambda - an interface with two or more abstract methods cannot use lambda
        // Pet cat = () -> System.out.println("Cat");
    }
}
