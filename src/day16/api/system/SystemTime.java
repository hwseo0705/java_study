package day16.api.system;

import utility.Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SystemTime {

    public static void main(String[] args) {
        // current time in millisecond
        // unix time (apoc time) : time in seconds since 01.01.1970
        long now = System.currentTimeMillis();
        System.out.println("now = " + now);

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("date = " + dateFormat.format(date));

        Util.line();

        int[] arr = new int[100000];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr.length - i;
        }

        // sort algorithm time
        long s = System.currentTimeMillis();
//        BubbleSort.sort(arr); // bubble sort : 4262ms
//        SelectionSort.sort(arr); // selection sort : 3687ms
//        InsertionSort.sort(arr); // insertion sort : 1774ms
//        RadixSort.sort(arr); // radix sort : 78ms
        Arrays.sort(arr); // quick sort : 15ms
        long e = System.currentTimeMillis();

        
        long time = e - s;
        System.out.println("time = " + time);
    }
}
