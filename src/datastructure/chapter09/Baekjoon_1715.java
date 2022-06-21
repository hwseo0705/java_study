package datastructure.chapter09;

import java.io.IOException;
import java.util.PriorityQueue;

public class Baekjoon_1715 { // USE PRIORITY QUEUE : 자동정렬
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        for (int i = 0; i < N; i++) {
//            queue.offer(Integer.parseInt(br.readLine()));
//        }
//        br.close();

        int N = 3;
        int[] nums = {10, 20, 40, 50, 70};

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        while (!queue.isEmpty()) {
            PriorityQueue<Integer> newQueue = new PriorityQueue<>();
            newQueue.offer(queue.poll());
        }
        System.out.println(queue);

        int total = 0;
        total += queue.poll() + queue.poll();
        queue.offer(total);



        System.out.println(queue);
    }
}
