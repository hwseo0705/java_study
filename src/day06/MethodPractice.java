package day06;

import java.util.Arrays;

public class MethodPractice {

    private static String[] foods = {"떡볶이", "치킨", "파스타"};

    // 배열의 마지막 위치에 데이터를 추가하는 함수
    public static void push(String newFood) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood;
        foods = temp;
    }

    // 배열 내부 데이터 출력 함수
    public static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    public static int indexOf(String targetFood) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(targetFood)) {
                return i;
            }
        }
        return -1;
    }

    /*
     static void pop() {
        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
    }

    static void remove(String targetName) {
        int index = indexOf(targetName);
        if (!include(targetName)) {
            System.out.println("존재하지 않는 음식명입니다");
            return;
        }
        for (int i = index; i < foods.length-1; i++) {
            foods[i] = foods[i+1];
        }
        pop();
    }

    */

    public static void remove(String food) {
        if (!include(food)) {
            System.out.println("존재하지 않는 음식명입니다.");
            return;
        }

        String[] temp = new String[foods.length - 1];
        int j = 0;

        for (int i = 0; i < foods.length - 1; i++) {
            if (foods[i].equals(food)) j++;
            temp[i] = foods[j++];
        }
        foods = temp;
    }

    public static boolean include(String food) {
//        for (String s : foods) {
//            if (s.equals(food)) return true;
//        }
//        return false;
        return indexOf(food) != -1;
    }

    public static void insert(int index, String food) {
        String[] temp = new String[foods.length + 1];
        int j = foods.length - 1;
        for (int i = temp.length - 1; i >= 0; i--) {
            if (i == index) temp[i] = food;
            else temp[i] = foods[j--];
        }
        foods = temp;
    }

    public static void modify(int index, String food) {
        foods[index] = food;
    }

    public static void clear() {
        foods = new String[0];
    }

    public static void main(String[] args) {
        push("피자");
        push("김치찌개");
        printFoods();

        int idx = indexOf("파스타"); // 2
        int idx2 = indexOf("김치찌개"); // 4
        int idx3 = indexOf("짜장면"); // -1
        System.out.printf("%d %d %d\n", idx, idx2, idx3);

        remove("김치찌개"); // foods배열에서 김치찌개 제거
        remove("망고"); // 존재하지 않는 음식명입니다 출력.
        printFoods();

        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴
        System.out.printf("%b %b\n", flag, flag2);

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
        printFoods();

        clear();  // foods배열 모든 데이터 삭제
        printFoods();
    }
}
