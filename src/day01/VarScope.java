package day01;

public class VarScope {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
//        int num3 = 0;

//        alt + enter : 선언 및 대입 분할
        
        if (true) {
            // does not work because num1 is already declared outside (in memory)
//            int num1 = 300;
            int num3 = num1 + num2; // num3 erased when if ends
//            num3 = num1 + num2;
            System.out.println("num3 inside = " + num3);
        } // end if

        // error : cannot find symbol 'num3'
        // --> num3 is declared inside the if-block
        // 특정 블록에서 선언된 변수는 해당 블록을 벗어나면 메모리에서 자동 삭제됨
//        System.out.println("num3 outside = " + num3);

        // this works because num3 was erased from memory when if ended
        int num3 = 500;

    } // end main
//    int num4 = num1 + num2; // not gonna work
} // end class
