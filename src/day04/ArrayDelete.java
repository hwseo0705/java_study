package day04;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {
        // 배열 특정 인덱스 데이터 삭제 알고리즘
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("Before Delete: " + Arrays.toString(arr));

        // Delete 5 - 1, 3, 7, 9, 11
        for (int i = 2; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;

        System.out.println("After Delete: " + Arrays.toString(arr));
    }
}
