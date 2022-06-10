package com.kh.practice.chap01_ploy.view;

import com.kh.practice.chap01_ploy.controller.LibraryController;
import com.kh.practice.chap01_ploy.model.vo.Book;
import com.kh.practice.chap01_ploy.model.vo.Member;

import java.util.Scanner;

// importing all the static fields in 'LibraryController'
import static com.kh.practice.chap01_ploy.controller.LibraryController.*;
import static java.lang.System.*; // see line 102

public class LibraryMenu {

    private LibraryController lc;
    private Scanner sc;

    public LibraryMenu() {
        lc = new LibraryController();
        sc = new Scanner(System.in);
        mainMenu();
    }

    public void mainMenu() {
        System.out.println("# 회원 정보를 입력해주세요.");
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별: ");
        char gender = sc.nextLine().charAt(0);

        lc.insertMember(new Member(name, age, gender));

        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("메뉴 번호: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(lc.myInfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
            }

        }
    }

    public void selectAll() {
        Book[] bList = lc.selectAll();
        for (int i = 0; i < bList.length; i++) {
            if (bList[i] == null) break;
            System.out.printf("%d번도서 : %s\n", i, bList[i].toString());
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] books = lc.searchBook(keyword);
        for (Book book : books) {
            if (book == null) break;
            System.out.println(book.toString());
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택: ");
        int index = sc.nextInt();
        sc.nextLine();
        int i = lc.rentBook(index);
        switch (i) {
            case RENT_SUCCESS:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case RENT_FAIL:
                System.out.println("나이 제한으로 대여 불가능입니다.");
                break;
            case RENT_SUCCESS_WITH_COUPON:
                // SEE HERE
                out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
                break;

        }
    }
}
