package day07.com.kh.example.practice4.model.vo;

public class Student {
    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    public Student() {}

    public Student(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public void setter() {}

    public void getter() {}

    public void information() {
        System.out.printf("%d학년 %d반 %s 정보:\n", grade, classroom, name);
        System.out.printf("키: %.2fCM, 성별: %c\n", height, gender);
    }
}
