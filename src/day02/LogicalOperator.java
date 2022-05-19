package day02;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean t = true, f = false;
        System.out.println(t & t);
        System.out.println(t & f);
        System.out.println(f & t);
        System.out.println(f & f);

        System.out.println("----------------------------------------");

        int x = 10, y = 20;

        boolean result1 = (x != 10) & (++y == 21);
        System.out.println("result1 = " + result1);
        boolean result2 = (x == 10) | (++y == 21);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // &&, || ignores the second condition if the first one determines the answer
        // &, | checks both left and right
        x = 10;
        y = 20;
        boolean result3 = (x != 10) && (++y == 21);
        System.out.println("result3 = " + result3);
        boolean result4 = (x == 10) || (++y == 21);
        System.out.println("result4 = " + result4);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("----------------------------------------");

        System.out.println(!t);
        System.out.println("Hel" + "lo!"); // 결합연산자
        // num & num : 비트연산자
        // 논리 & 논리 : 논리연산자

    }
}
