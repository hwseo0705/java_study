package day07.com.kh.example.practice1.run;

import day07.com.kh.example.practice1.model.vo.Member;

public class Run {
    public static void main(String[] args) {
        Member member = new Member();
        member.changeName("Haewon");
        member.printName();
    }
}
