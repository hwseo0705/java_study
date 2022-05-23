package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] foodList = {};

        System.out.println("#먹고 싶은 음식을 입력하세요!");
        System.out.println("#입력을 중지하려면 <그만>이라고 입력하세요.");

        while (true) {

            String food = sc.next();

            if (food.equals("그만")) {
                System.out.printf("먹고 싶은 음식리스트: %s", Arrays.toString(foodList));
                return;
            }

            foodList = newArray(foodList, food);

        }

    }

    public static String[] newArray(String[] foodList, String food) {
        String[] temp = new String[foodList.length + 1];
        int i = 0;
        if (foodList.length > 0) {
            for (i = 0; i < foodList.length; i++) {
                temp[i] = foodList[i];
            }
        }
        temp[i] = food;
        return temp;
    }
}
