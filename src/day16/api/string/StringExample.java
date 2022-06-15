package day16.api.string;

import utility.Util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringExample {
    public static void main(String[] args) {

        String s = "1 2 3 4";

        // Split 1
        String[] sArr = s.split(" ");
        int[] numbers = new int[sArr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sArr[i]);
        }
        System.out.println(Arrays.toString(numbers));

        Util.line();

        // Split 2
        StringTokenizer st = new StringTokenizer(s, " ");
        String[] nums = new String[st.countTokens()];
        for (int i = 0; st.hasMoreTokens(); i++) {
            nums[i] = st.nextToken();
        }
        System.out.println(Arrays.toString(nums));

        Util.line();

        /*
        *   '+=' will use up too much memory space
        *   because '+=' keeps the original string in original memory and
        *   creates a new string and saves it in a new memory
        *
        *   StringBuilder is way faster
        * */


//        String str = "";
        StringBuilder sb = new StringBuilder();
        long ss = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
//            str += (i + 1);
            sb.append(i + 1); // way faster
        }
        long ee = System.currentTimeMillis();
        System.out.println((ee - ss) + "ms");
    }
}
