package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

    private Student[] s;
    private Employee[] e;

    public PersonController() {
        s = new Student[3];
        e = new Employee[10];
    }

    public int[] personCount() {
        int stuCount = 0;
        int empCount = 0;
        for (Student student : s) {
            if (student != null) stuCount++;
        }
        for (Employee employee : e) {
            if (employee != null) empCount++;
        }
        return new int[]{stuCount, empCount};
    }

    public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
        s[personCount()[0]] = new Student(name, age, height, weight, grade, major);
    }

    public Student[] printStudent() {
        return s;
    }

    public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
        e[personCount()[1]] = new Employee(name, age, height, weight, salary, dept);

    }

    public Employee[] printEmployee() {
        return e;
    }
}
