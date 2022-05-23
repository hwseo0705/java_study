package day04;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        // 배열 복사 알고리즘
        String[] pets = {"Dog", "Bird", "Chick"};
        // this is actually not an actual copy
        // because this is saying that the address of petsCopy
        // is the same as the address of pets
        // String[] petsCopy = pets;
        // pets[1] = "Cat";
        // petsCopy[0] = "Tiger";

        // 1. 원본 배열과 사이즈가 같은 새 배열을하나 더 생성
        String[] petsCopy = new String[pets.length];

        // 2. 원본 배열에 저장된 값들을 하나하나씩 사본배열로 복사
        // alt + enter
        petsCopy[0] = pets[0];
        petsCopy[1] = pets[1];
        petsCopy[2] = pets[2];

        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];

        }

        System.out.println("Original: " + Arrays.toString(pets));
        System.out.println("Original Address: " + pets);
        System.out.println("Copy: " + Arrays.toString(petsCopy));
        System.out.println("Copy Address: " + petsCopy);
    }
}
