package day02;

public class Casting2 {
    public static void main(String[] args) {

        // down-casting
        // down-casting can cause a loss of value

        // 0011 1110 1000 --> int 1000 to binary
        int n = 1000;
        byte m = (byte) n;
        System.out.println("m = " + m);

        double k = 5.556;
        int j = (int) k;
        System.out.println("j = " + j);
    }
}
