package day08;

public class PersonMain {
    public static void main(String[] args) {
        // this won't work because there already is
        //  a constructor with one argument
        // It will only work when there's NONE!!!
        // Person person = new Person();

        Person person = new Person("Haewon");
    }
}
