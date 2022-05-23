package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] memberList = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 변경 전 정보: " + memberList);
        System.out.println("- 수정할 멤버의 이름을 입력하세요.");
        String member;
        int index = -1;
        while (true) {
            System.out.print(">> ");
            member = sc.nextLine();
            index = memberExists(memberList, member);
           if (index == -1) {
                System.out.printf("%s은(는) 없는 이름입니다.\n", member);
                System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            } else break;
        }

        System.out.printf("%s의 이름을 변경합니다.\n>> ", member);
        String newName = sc.nextLine();
        memberList[index] = newName;
        System.out.println("변경 완료!!");
        System.out.printf("* 변경 후 정보: %s", Arrays.toString(memberList));
    }

    public static int memberExists(String[] memberList, String member) {
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].equals(member)) {
                return i;
            }
        }
        return -1;
    }
}