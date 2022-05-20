package CodingPractice;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Height : ");
        int height = sc.nextInt();
        System.out.print("Which Shape? Type 1~6 : ");
        int shape = sc.nextInt();
        String result = "";

        switch (shape) {
            case 1:
                for (int i = 1; i <= height; i++) {
                    for (int j = 0; j < i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                for (int i = height; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < height; j++) {
                        if (j < height - i - 1) {
                            result += " ";
                        } else {
                            result += "*";
                        }
                    }
                    result += "\n";
                }
                break;
            case 4:
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < height; j++) {
                        if (j < i) {
                            result += " ";
                        } else {
                            result += "*";
                        }
                    }
                    result += "\n";
                }
                break;
            case 5:
                int regular = 2 * height - 1;
                for (int i = height - 1; i >= 0; i--) {
                    for (int j = 0; j < regular; j++) {
                        if (i > j || regular - i - 1 < j) {
                            result += " ";
                        } else {
                            result += "*";
                        }
                    }
                    result += "\n";
                }
                break;
            case 6:
                int reversed = 2 * height - 1;
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < reversed; j++) {
                        if (i > j || reversed - i - 1 < j) {
                            result += " ";
                        } else {
                            result += "*";
                        }
                    }
                    result += "\n";
                }
                break;
        }

        System.out.println(result);
        sc.close();
    }
}