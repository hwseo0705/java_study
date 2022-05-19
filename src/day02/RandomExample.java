package day02;

public class RandomExample {
    public static void main(String[] args) {
        // Generate Random
        // 0.0 <= ~ <= 1.0
        double rn = Math.random();
        System.out.println("rn = " + rn);
        System.out.printf("rn = %.5f\n", rn);

        // 1 <= ~ <= 10
        // (int) Math.random() * 10 + 1 will only output 1
        // because Math.random() will output 0.0 ~ 1.0
        // then * 10 will output 0 ~ 1, but it will always be 0
        int rn2 = (int) (Math.random() * 10) + 1;
        System.out.println("rn2 = " + rn2);
    }
}