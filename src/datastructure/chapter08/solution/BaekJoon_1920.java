package datastructure.chapter08.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.readLine();
        String[] nNum = br.readLine().split(" ");
        br.readLine();
        int M = Integer.parseInt(br.readLine());
        br.readLine();
        String[] mNum = br.readLine().split(" ");
        br.close();

        Arrays.sort(nNum);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mNum.length; i++) {
            System.out.println(Arrays.binarySearch(nNum, mNum[i]));
            if (Arrays.binarySearch(nNum, mNum[i]) >= 0) sb.append("1\n");
            else sb.append("0\n");
        }
        System.out.println(sb);
    }
}