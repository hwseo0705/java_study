package com.kh.practice.chap01_ploy.controller;

import com.kh.practice.chap01_ploy.model.vo.AniBook;
import com.kh.practice.chap01_ploy.model.vo.Book;
import com.kh.practice.chap01_ploy.model.vo.CookBook;
import com.kh.practice.chap01_ploy.model.vo.Member;

import java.util.LinkedList;
import java.util.Queue;

public class LibraryController {

    private Member mem;
    private Book[] bList;
    
    // 필요한 상수 선언
    public static final int RENT_SUCCESS = 0;
    public static final int RENT_FAIL = 1;
    public static final int RENT_SUCCESS_WITH_COUPON = 2;

    public LibraryController() {
        // mem = null;
        bList = new Book[5];
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {
        return bList;
    }

    public Book[] searchBook(String keyword) {
        // What I Did
        Book[] books = new Book[5];
        // Alternate Way
        Queue<Book> bookQueue = new LinkedList<>();

        int index = 0;
        for (Book b : bList) {
            if (b.getTitle().contains(keyword)) {
                books[index++] = b;
                bookQueue.add(b);
            }
        }

        // Alternate Way
        Book[] searchedList = new Book[bookQueue.size()];
        for (int i = 0; i < searchedList.length; i++) {
            searchedList[i] = bookQueue.poll();
        }

        return searchedList /* books */;
    }

    /*
    *
    * @param index - 대여할 책의 인덱스번호
    * @return 단순 대여 성공 - 0
    *         만화책 나이제한 대여 실패 - 1
    *         요리책 대여성공 + 쿠폰발급 - 2
    *
    * */
    public int rentBook(int index) {
        Book selected = bList[index];
        if (selected instanceof AniBook) {
            if (mem.getAge() < ((AniBook) selected).getAccessAge()) return RENT_FAIL;
        } else if (selected instanceof CookBook) {
            if (((CookBook) selected).isCoupon()) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                return RENT_SUCCESS_WITH_COUPON;
            } else return RENT_SUCCESS;
        }
        return RENT_SUCCESS;
    }
}
