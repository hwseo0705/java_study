package day16.api.wrapper;

public class Wrapper {
    public static void main(String[] args) {

        Object[] arr = {10, 22};

        // wrapper class of int
        // why do classes 'Integer' or 'String' not have to create new objects?
        // java allowed skipping 'new Integer() or new String("string")' --> auto boxing
        Integer n = 10;
        String s = "string";

        // should to this but java gives auto unboxing
        // int m = n.intValue();
        int m = n; // auto unboxing

        // more functions than 'int'
        System.out.println(Integer.MAX_VALUE);

        // if you want to initialize a number to null, use Wrappers (Integer, Character, ...)
        // else you use primitive ones (int, char, ...)
    }
}
