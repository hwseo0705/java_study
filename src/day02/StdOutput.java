package day02;

public class StdOutput {
    public static void main(String[] args) {
        String dog = "woof", cat = "meow";
        System.out.print(dog); // no newline
        System.out.println(cat);

        int month = 7;
        int day = 17;
        String anniversary = "제헌절";

        // %d : decimal, %f : float, %s : string, %c : character
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anniversary);
        System.out.println(dog);

        // %f : shows 6 decimal places
        // .#f : round up to # decimal places
        double rate = 25.45678901234;
        System.out.printf("비율은 %.4f입니다.\n", rate);
        System.out.printf("비율은 %.2f입니다.\n", rate);
        System.out.printf("\\비율은 %.2f%%입니다.\n", rate);
   }
}
