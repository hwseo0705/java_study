
// My Solution
/* package datastructure.chapter09;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class BaekJoon_11047 {
    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            int money = Integer.parseInt(str[1]);

            int[] moneyArr = new int[N];
            for (int i = 0; i < N; i++) {
                moneyArr[i] = Integer.parseInt(br.readLine());
            }
            br.close();
    //
    //        int[] moneyArr = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
    //        int money = 4790;
            int count = 0;
            for (int i = moneyArr.length - 1; i >= 0; i--) {
                int current = moneyArr[i];
                if (current > money) continue;
                count += money / current;
                money %= current;
                if (money <= 0) break;
            }
            System.out.println(count);
        }
}
*/

// Instructor's Solution
package datastructure.chapter09;

import java.util.Scanner;
import java.util.Stack;

// 백준 11047
public class BaekJoon_11047 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //동전의 개수
        int K = sc.nextInt(); //목표 액수

        //동전을 담을 자료구조
        Stack<Integer> A = new Stack<>();
        for (int i = 0; i < N; i++) {
            A.push(sc.nextInt());
        }
        sc.close();

        int count = 0; // 동전의 수
        while (!A.isEmpty()) {
            int coinAmt = A.pop(); // 꼭대기 동전부터 추출
            if (coinAmt <= K) {
                count += (K / coinAmt); // 동전 개수 누적
                K %= coinAmt; // 잔액 갱신
            }

            if (K == 0) break;
        }
        System.out.println(count);
    }

}