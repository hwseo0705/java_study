package datastructure.chapter05.solution;


import java.util.Scanner;
import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        Stack<Integer> stack = new Stack();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < N-1; i++) {
            stack.push(A[i]);
            if (A[i] > A[i+1]) stack.push(A[i]);
            else {
                int nge = stack.pop();
                while (!stack.isEmpty()) {
                    str.append(nge);
                }
            }

        }

        System.out.println(str);
    }
}
