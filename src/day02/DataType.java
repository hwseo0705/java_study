package day02;

public class DataType {
    public static void main(String[] args) {
        // 정수 types
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        // the number 2147483648 has to be saved in the memory before
        // it gets assigned to the variable, the following doesn't work
        // since the integer that is getting saved first cannot take in
        // a long value, therefore, cannot assign. Do the second one instead
//        long d = 2147483648;
        long d = 2147483648L;

        int i;
        double n  = 0.0;
        for (i = 0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("n = " + n);

        // 실수 types
        float f1 = 1.2345678901234F; // 4 bytes
        double d1 = 1.2345678901234; // 8 bytes

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);

        // 논리 type
        boolean b1 = true;
        boolean b2 = false;

        // 문자 types
        // 기본 타입 : char
        // 2byte 할당, 음수개념 x, 글자 1글자만 저장가능

        // 65 : A , 97 : a
        char c1 = 'A';
        char c2 = 44032; // '가'
        System.out.println("c2 = " + c2);

        // 문자열 타입 String
        // String은 기본타입이 아닙니다. 객체입니다.
        String s1 = "hello java";
        
        // 문자 + 숫자 = 문자
        System.out.println(s1 + 300 + 220);
    }
}
