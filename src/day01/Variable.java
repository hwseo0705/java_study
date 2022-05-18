package day01;

public class Variable {
    public static void main(String[] args) {
        // declare a variable (assign type)
        int score;
        // initialize a variable
        score = 100;
        System.out.println("score = " + score);

        int count = 3;
        count = 5; // modify
        System.out.println("count = " + count);

        int triple = score * 3;
        System.out.println("triple = " + triple); // soutv

        // 정수: int, 실수: double, 문자열: String
        String nickname = "Julie";
        System.out.println("nickname = " + nickname);

        /*
         cannot do the following two
         nickname = 5.5;
         double score = 99.9;
        */

        // ctrl + alt + v
        // it will automatically assign type and name to value
        String userName = "Haewon";
        int i = 100;
        double random = Math.random();
    }
}
