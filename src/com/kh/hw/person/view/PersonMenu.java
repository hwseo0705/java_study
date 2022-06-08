package com.kh.hw.person.view;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

import java.util.Scanner;

public class PersonMenu {

    private Scanner sc;
    private PersonController pc;

    public PersonMenu() {
        sc = new Scanner(System.in);
        pc = new PersonController();
        this.mainMenu();
    }

    public void mainMenu() {

        while (true) {
            System.out.println("\n학생은 최대 3명까지 저장할 수 있습니다.");
            System.out.printf("현재 저장된 학생은 %d명입니다.\n", pc.personCount()[0]);
            System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
            System.out.printf("현재 저장된 사원은 %d명입니다.\n\n", pc.personCount()[1]);

            System.out.println("1. 학생 메뉴");
            System.out.println("2. 사원 메뉴");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    employeeMenu();
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    public void studentMenu() {
        int loop = 1;
        while (true) {

            System.out.println("\n1. 학생 추가");
            System.out.println("2. 학생 보기");
            System.out.println("9. 메인으로");

            if (pc.personCount()[0] == 3) {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
                loop = 0;
            }

            System.out.print("메뉴 번호 : ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (loop == 0 && choice == 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                continue;
            }

            switch (choice) {
                case 1:
                    insertStudent();
                    break;
                case 2:
                    printStudent();
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }

        }
    }

    public void employeeMenu() {
        int loop = 1;
        while (true) {

            System.out.println("\n1. 사원 추가");
            System.out.println("2. 사원 보기");
            System.out.println("9. 메인으로");

            if (pc.personCount()[1] == 10) {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
                loop = 0;
            }

            System.out.print("메뉴 번호 : ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (loop == 0 && choice == 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                continue;
            }
            switch (choice) {
                case 1:
                    insertEmployee();
                    break;
                case 2:
                    printEmployee();
                    break;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }

        }
    }

    public void insertStudent() {
        while (true) {

            getStudentInfo();

            if (pc.personCount()[0] != 3) {
                System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
                String choice = sc.nextLine();
                switch (choice) {
                    case "N":
                    case "n":
                        return;
                }
            } else {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
                return;
            }
        }
    }

    public void getStudentInfo() {
        System.out.print("\n학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("학생 키 : ");
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.print("학생 몸무게 : ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.print("학생 학년 : ");
        int grade = sc.nextInt();
        sc.nextLine();
        System.out.print("학생 전공 : ");
        String major = sc.nextLine();
        pc.insertStudent(name, age, height, weight, grade, major);
    }

    public void printStudent() {
        System.out.println();
        for (Student s : pc.printStudent()) {
            if (s == null) break;
            System.out.println(s.toString());
        }
    }


    public void insertEmployee() {
        while (true) {

            getEmployeeInfo();

            if (pc.personCount()[1] != 10) {
                System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
                String choice = sc.nextLine();
                switch (choice) {
                    case "N":
                    case "n":
                        return;
                }
            } else {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 학생 메뉴로 돌아갑니다.");
                return;
            }
        }
    }

    private void getEmployeeInfo() {
        System.out.print("\n사원 이름 : ");
        String name = sc.nextLine();
        System.out.print("사원 나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("사원 키 : ");
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.print("사원 몸무게 : ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.print("사원 급여 : ");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.print("사원 부서 : ");
        String dept = sc.nextLine();
        pc.insertEmployee(name, age, height, weight, salary, dept);
    }

    public void printEmployee() {
        System.out.println();
        for (Employee e : pc.printEmployee()) {
            if (e == null) break;
            System.out.println(e.toString());

        }
    }

}
