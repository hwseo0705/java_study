package day04;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {
        // 배열 데이터 추가 알고리즘
        int[] arr = {10, 20, 30};
        int newData = 40;

        // 1. 원본 배열보다 사이즈가 1 큰 새로운 배열 생성
        int[] arrCopy = new int[arr.length + 1];

        // 2. 원본 배열의 데이터를 새로운 배열에 복사
        int i;
        for (i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }
        
        // 3. 추가할 데이터를 마지막 인덱스에 추가
        arrCopy[i] = newData;
        
        // 4. 주소값 이전
        arr = arrCopy;
        arrCopy = null;
        
        System.out.println(Arrays.toString(arr));
    }
}
