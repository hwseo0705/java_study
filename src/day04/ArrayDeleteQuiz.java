package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] studentList = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 우리반 학생들의 별명: " + studentList);
        int index = -1;
        while (true) {
            System.out.print("- 삭제할 학생의 별명을 입력하세요!\n>> ");
            String student = sc.nextLine();
            index = checkStudent(studentList, student);
            if (index == -1) {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n", student);
            } else {
                System.out.printf("%s의 별명을 삭제합니다.\n", student);
                studentList = deleteStudent(studentList, index);
                System.out.println("* 삭제 후 정보: " + Arrays.toString(studentList));
                break;
            }
        }
    }

    public static String[] deleteStudent(String[] studentList, int index) {
        String[] temp = new String[studentList.length - 1];
        int j = 0;
        for (int i = 0; i < studentList.length; i++) {
            if (i == index) continue;
            temp[j++] = studentList[i];
        }
        return temp;
    }
    public static int checkStudent(String[] studentList, String student) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }
}
