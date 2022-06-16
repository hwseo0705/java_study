package datastructure.chapter08;

import java.util.Arrays;

public class Search {

    // linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    // binary search
    public static int binarySearch(int[] arr, int target) {
        // left, right mid
        int left = 0, right = arr.length - 1;
        int mid;

        while (left <= right) {
            // get mid index
            mid = (left + right) / 2;

            // value in index 'mid' == 'target'
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 11, 12, 27, 49, 53, 68, 72, 91};
        int target = 53;
        System.out.printf("Linear Search(%d's index): %d\n", target, linearSearch(arr, target));
        System.out.printf("Binary Search(%d's index): %d\n", target, binarySearch(arr, target));

        // JAVA API
        System.out.println(Arrays.binarySearch(arr, target));
    }
}
