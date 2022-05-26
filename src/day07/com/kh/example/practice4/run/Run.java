package day07.com.kh.example.practice4.run;

import day07.com.kh.example.practice4.model.vo.Student;

public class Run {
    public static void main(String[] args) {
        Student student = new Student(1, 1, "서해원", 168, 'F');
        student.information();
    }
}
