package CodingPractice;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[9];
        int max = 0;
        int index = -1;
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr.length);
            int check = Integer.parseInt(br.readLine());
            if (check > max) {
                max = check;
                index = i;
            }
//            br.skip(1L);
        }

        System.out.printf("%d %d\n", max, index+1);

        br.close();

    }
}