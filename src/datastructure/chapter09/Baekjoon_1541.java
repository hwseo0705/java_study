
// My Solution
/*
package datastructure.chapter09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        String[] math = read.split("-");

        int total = 0;
        if (math.length == 1) {
            math = read.split("\\+");
            for (int i = 0; i < math.length; i++) {
                total += Integer.parseInt(math[i]);
            }
        } else {
            total = Integer.parseInt(math[0]);
            for (int i = 1; i < math.length; i++) {
                String[] math1 = math[i].split("\\+");
                for (int j = 0; j < math1.length; j++) {
                    total -= Integer.parseInt(math1[j]);
                }
            }
        }
        System.out.println(total);
    }
}
*/

//Instructor's Solution
package datastructure.chapter09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1541 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, "-");
        int result = Integer.parseInt(st.nextToken());
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            int sum = calcTotal(token);
            result -= sum;
        }
        System.out.println(result);
    }
    private static int calcTotal(String token) {
        int total = 0;
        StringTokenizer st1 = new StringTokenizer(token, "+");
        while (st1.hasMoreTokens()) {
            total +=  Integer.parseInt(st1.nextToken());
        }
        return total;
    }
}
// 100-40+50+74-30+29-45+43+11
