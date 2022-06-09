package datastructure.chapter05.solution;

import java.util.Scanner;
import java.util.Stack;

// 백준 1874
public class StackA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 1 ~ N 까지의 자연수

        // pop order
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        // Java API
        Stack<Integer> stack = new Stack<>();
        int num = 1; // 자연수 값 저장

        // 기호를 저장할 문자열
        StringBuilder s = new StringBuilder();
        //        String s = "";

        // 수열 배열에서 값을 하나씩 뽑아서 push, pop 여부 확인
        for (int i = 0; i < A.length; i++) {
            int targetNum = A[i]; // 현재 수열 값
            if (targetNum >= num) { // push
                while (targetNum >= num) {
                    stack.push(num++);
                    s.append("+\n");
                }
                // 마지막에 들어간 수를 pop
                stack.pop();
                s.append("-\n");
            } else { // pop
                int n = stack.pop(); // 스택에서 제거한 숫자
                if (n > targetNum) {
                    s = new StringBuilder("NO");
                    break;
                } else {
                    s.append("-\n");
                }
            }
        }
        System.out.println(s);
    }
}
