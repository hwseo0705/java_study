package day04;

public class ArraySearch {
    public static void main(String[] args) {
        // 배열 탐색 앍리즘
        // 인덱스 찾기, 유무 확인
        String[] foods = {"Chicken", "Pizza", "Pork Belly", "Pasta"};
        String target = "Pork Belly";

        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        }
        System.out.println("Index Found: " + index);

        boolean hasFood = index != -1;
        System.out.println("Exists? " + hasFood);
    }
}
