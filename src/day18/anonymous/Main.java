package day18.anonymous;

import utility.Util;

public class Main {

    // Inner Class : static possible
    public static class SubOperator implements Calculator {
        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {

        // 1. regular external class
        Calculator addCal = new AddOperator();
        System.out.println(addCal.operate(10, 20));

        // 2. inner class - create a class inside the class
        Calculator subCal = new SubOperator();
        System.out.println(subCal.operate(50, 30));

        // 3. anonymous class - create an anonymous class and save it in 'multiCal'
        Calculator multiCal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        }; // creates a no name class
        System.out.println(multiCal.operate(5, 3));

        // 4. lamda
        Calculator divCal = (n1, n2) -> n1 / n2;
        System.out.println(divCal.operate(100, 50));

        Util.line();

        PowerfulOperator po = (f, s, cal) -> cal.operate(f, s);
        System.out.println(po.powerOperate(300, 500, new AddOperator()));
        System.out.println(po.powerOperate(700, 200, new SubOperator()));
        System.out.println(po.powerOperate(10, 30, new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        }));

        System.out.println(po.powerOperate(1000, 200, (n1, n2) -> n1 / n2));
    }
}