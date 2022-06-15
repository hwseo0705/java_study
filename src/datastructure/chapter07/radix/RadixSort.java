package datastructure.chapter07.radix;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort { // can't use with negative, gotta do special something for negatives

    public static void main(String[] args) {
        int[] arr = {753, 427, 450, 422, 220, 125, 332, 339, 1990, 660};

        sort(arr); // radix sort

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }

    // radix sort
    public static void sort(int[] arr) {

        // get max digit
        int digit = 0;
        for (int n : arr) {
            int len = String.valueOf(n).length();
            if (len > digit) digit = len;
        }

        // create 10 queues for each digit
        // 각 자리수 숫자에 맞는 큐 10개 생성
        Queue<Integer>[] queues = new Queue[10];
        for (int i = 0; i < queues.length; i++) {
            queues[i] = new LinkedList<>();
        }

        /*
            1회차 루프에서는 각 숫자의 1의 자리수를 뽑아서
            위치에 맞는 큐에 삽입해야 함.

            2회차 루프(i==1)에서는 각 숫자의 10의 자리수를 뽑아서
            위치에 맞는 큐에 삽입해야 함.

            3회차 루프(i==2)에서는 각 숫자의 100의 자리수를 뽑아서
            위치에 맞는 큐에 삽입해야 함.
        */

        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < arr.length; j++) {
             /*
                i = 0 : third digit (1의 자리) n / 10^0 % 10
                i = 1 : second digit (10의 자리) n / 10^1 % 10
                i = 2 : first digit (100의 자리) n / 10^2 % 10
             */
                int n = arr[j] / ((int) Math.pow(10, i)) % 10;

                // 해당 자리수에 맞는 큐에 저장
                queues[n].add(arr[j]);
            } // inner for (arr)

            // 큐에서 순서대로 poll 하여 배열에 다시 저장
            int k = 0; // 배열 저장 위치 인덱스
            for (Queue<Integer> q : queues) {
                while (!q.isEmpty()) {
                    arr[k++] = q.poll();
                }
            }
        }
    }
}

