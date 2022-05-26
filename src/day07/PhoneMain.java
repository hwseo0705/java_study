package day07;

public class PhoneMain {
    public static void main(String[] args) {
/*
        Phone p1 = new Phone();
        Phone p2 = new Phone();

        System.out.printf("p1의 주소: %s\n", p1);
        System.out.printf("p2의 주소: %s\n", p2);

        System.out.println("-----------------------");
        p1.powerOff();
        System.out.println("-----------------------");
        p1.showSpec();
        System.out.println("-----------------------");
        p2.showSpec();
*/
        Phone galaxy = new Phone("Galaxy S21");
        Phone iPhone = new Phone("iPhone12 Pro-Max");
        Phone gNote = new Phone("Galaxy Note");

        galaxy.sendMessage(iPhone, "Hello I'm Galaxy!");
        galaxy.sendMessage(iPhone, "LMAO");
        gNote.sendMessage(iPhone, "Hello I'm Galaxy Note!");
        iPhone.sendMessage(gNote, "Hello I'm Apple!");
        iPhone.sendMessage(galaxy, "Wassup Galaxy~");

        iPhone.checkMsg();
        galaxy.checkMsg();
        gNote.checkMsg();
    }
}
