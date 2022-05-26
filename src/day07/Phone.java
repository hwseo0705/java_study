package day07;

// 핸드폰 설계도
// 설계도로 쓸 class는 main을 만들지 않는다.
public class Phone {
    // 속성 : 객체의 데이터 (field)

    // 고유 속성
    // something that doesn't change much
    private String model;
    String color;
    int price;

    // 상태 속성
    // something that changes a lot
    int messageCount; // # of messages received
    boolean on; // power on or off

    // 부품 속성
    // 문자메시지함
    String[] receivedMsg = new String[3];

    // Constructor (생성자) : Initializes the Object, Called when Object Created
    // if non specified, automatically creates a default constructor
    // void - 기본 생성자 ㅎㅎ
    Phone() {
        System.out.println("First Constructor!");
        this.model = "iPhone";
        this.color = "Space Grey";
        this.price = 1300000;
        powerOn();
    }

    // constructor overloading
    // multi constructors allowed with diff params
    Phone(String model) {
        System.out.println("Second Constructor!");
        this.model = model;
        this.color = "White";
        this.price = 1100000;
        powerOn();
    }

    Phone(String model, String color) {
        System.out.println("Third Constructor!");
        this.model = model;
        this.color = color;
        this.price = 800000;
        powerOn();
    }

    Phone(String model, String color, int price) {
        System.out.println("Fourth Constructor!");
        this.model = model;
        this.color = color;
        this.price = price;
        powerOn();
    }

    // 기능 : 객체의 행위, 동작 (method)
    // 설게도의 메서드는 static을 붙이지 말 것!

    // Power On Method
    void powerOn() {
        on = true;
        System.out.println(model + "의 전원을 켭니다");
    }

    // Power Off Method
    void powerOff() {
        on = false;
        System.out.println(model + "의 전원을 끕니다");
    }

    // 핸드폰 정보를 알려주는 기능
    void showSpec() {
        if (!on) {
            System.out.println(model + "의 전원을 먼저 켜세요.");
            return;
        }
        System.out.println("# 휴대폰 정보");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price);
    }

    // Send Message Method
    // iPhone.sendMessage(galaxy)
    void sendMessage(Phone phone, String msg) {
        // is the message full
        if (phone.receivedMsg.length > phone.messageCount) {
            phone.receivedMsg[phone.messageCount++] = msg + " by " + model;
        } else {
            System.out.println(phone.model + "'s message is full.");
        }
    }

    // Check Received Messages
    void checkMsg() {
        System.out.printf("\n----------- [%s]'s Messages -----------\n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i + 1, receivedMsg[i]);
        }
    }
}// end class
