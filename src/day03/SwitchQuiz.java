package day03;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("직급을 입력하세요");
        System.out.println("[사원,대리,과장,차장,부장]");
        System.out.printf("> ");
        String position = sc.next();
        sc.close();

        // switch 괄호안에는 정수, 문자형 변수를 씁니다.
        // 분기를 나눌 데이터가 있는 변수
        switch (position) {
            // case에는 switch변수에 들어갈 경우의 수 값들을 배치
            // 단 변수는 배치 불가능, 상수나 리터럴만 가능
            case "사원":
                // 현재 케이스에서 실행할 코드 작성
                System.out.println("사원의 급여는 200만원 입니다.");
                break;
            case "대리":
                System.out.println("대리의 급여는 300만원 입니다.");
                break;
            case "과장":
                System.out.println("과장의 급여는 400만원 입니다.");
                break;
            case "차장":
                System.out.println("차장의 급여는 500만원 입니다.");
                break;
            case "부장":
                System.out.println("부장의 급여는 600만원 입니다.");
                break;
            default:
                System.out.printf("%s은(는) 없는 직급입니다.\n직급을 다시 입력해주세요.\n", position);
        }
    }
}
