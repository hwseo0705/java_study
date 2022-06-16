package day17.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> foodList = new ArrayList<>();

        System.out.println("#먹고 싶은 음식을 입력하세요!");
        System.out.println("#입력을 중지하려면 <그만>이라고 입력하세요.");

        while (true) {

            String food = sc.next();

            if (food.equals("그만")) {
                System.out.printf("먹고 싶은 음식리스트: %s", foodList);
                return;
            }
            foodList.add(food);
        }
    }
}
