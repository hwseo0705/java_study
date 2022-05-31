package com.kh.hw.member;

import com.kh.hw.member.controller.MemberController;

public class Test {
    public static void main(String[] args) {
        MemberController mc = new MemberController();
        System.out.println(mc.existMemberNum());

//        int abc = mc.findIndexById("abc");
//        System.out.println("abc = " + abc);

        mc.insertMember("zzz", "ddd", "111", "lssss", 'f', 33);
        mc.insertMember("zdz", "ddd", "111", "lssss", 'f', 33);
        System.out.println(mc.existMemberNum());
        System.out.println(mc.checkId("zz"));
    }
}
