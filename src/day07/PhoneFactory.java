package day07;

// 실행용 클래스
// main method yes!
public class PhoneFactory {
    public static void main(String[] args) {
        // Create Phone Object
        Phone oldP = new Phone();
        oldP.showSpec();

        System.out.println("--------------------------------------");
        Phone iPhone = new Phone("iPhone 12 Pro Max");
        iPhone.showSpec();

        System.out.println("--------------------------------------");
        Phone gNote = new Phone("Galaxy Note", "Rose Gold");
        gNote.showSpec();

        System.out.println("--------------------------------------");
        Phone galaxy = new Phone("Galaxy 21", "Pearl Blue", 1000000);
        // 객체의 속성과 기능을 참조( . 연산자)
//        galaxy.model = "Galaxy S21";
//        galaxy.color = "Pearl Blue";
//        galaxy.price = 1000000;
//        galaxy.powerOn();
        galaxy.showSpec();

    }
}
