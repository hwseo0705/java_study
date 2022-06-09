package datastructure.chapter05.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) { // 카드가 1장 남을 때까지
            queue.poll(); // 맨 위 카드를 버림
            queue.add(queue.poll()); // 맨 위 카드를 버리면서 맨 끝에 추가
        }

        System.out.println(queue.poll());
    }
}
