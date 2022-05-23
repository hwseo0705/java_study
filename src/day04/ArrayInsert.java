package day04;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = {50, 150, 200, 250, 300};
        
        int newNumber = 100; // 신규 삽입데이터
        int targetIdx = 2; // 삽입 위치

        System.out.println("Before Insert: " + Arrays.toString(arr));

        // 50, 100, 150, 200, 250, 300
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        for (int j = temp.length - 2; j >= targetIdx; j--) {
            temp[j + 1] = temp[j];
        }
        temp[targetIdx] = newNumber;

        arr = temp;
        temp = null;

        System.out.println("After Insert: " + Arrays.toString(arr));

    }
}
