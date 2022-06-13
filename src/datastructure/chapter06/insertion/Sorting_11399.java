package datastructure.chapter06.insertion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sorting_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
//        br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for (int i = 1; i < A.length; i++) {
            int temp = A[i];
            int j = i;
            while (j > 0 && temp <= A[j - 1]) {
                A[j] = A[j - 1];
                j--;
            }
            A[j] = temp;
        }

        int total = 0;
        int prevSum = 0;
        for (int num : A) {
            total += prevSum + num;
            prevSum += num;
        }
        System.out.println(total);
    }
}
