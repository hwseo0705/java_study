package day15.exception;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"Dove", "Turtle", "Bird"};

        for (int i = 0; i < 4; i++) { // ArrayIndexOutOfBoundsException
            try {
                System.out.println("I want a " + pets[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("There are no more pets in 'pets'");
            } finally { // no matter the exception, this code will run
                System.out.println("I love pets!\n");

                // 메모리 누수 방지 코드를 보통 finally에 작성
                // ex) 데이터베이스 연결코드, 네트워크 연결코드, 하드웨어 장치 연결코드...
            }
        }
        System.out.println("Program Exit (0)");
    }
}
