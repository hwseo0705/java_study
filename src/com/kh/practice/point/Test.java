package com.kh.practice.point;

import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.model.vo.Point;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println(p);
        Circle c = new Circle(20, 30, 5);
        System.out.println(c);
    }
}
