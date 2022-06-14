package day15.practice.run;

import day15.practice.controller.PhoneController;

public class Run {
    public static void main(String[] args) {
        PhoneController pc = new PhoneController();
        for (String s : pc.method()) {
            System.out.println(s);
            System.out.println();
        }
    }
}
