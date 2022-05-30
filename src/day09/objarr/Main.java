package day09.objarr;

public class Main {
    public static void main(String[] args) {

        // Banks
        Bank shinhan = new Bank("신한", 10);
        Bank kookmin = new Bank("국민", 5);
        Bank woori = new Bank("우리", 20);

        // Person s
        Person seo = new Person("Julie");
        Person kang = new Person("June");
        seo.money = 100000;
        kang.money = 5000;

        // 계좌 생성
        seo.makeAccount(shinhan);
        kang.makeAccount(woori);

        // 입금
        System.out.println("------------------------------------");
        seo.deposit(80000);
        kang.deposit(3000);

        // 계좌이체
        System.out.println("------------------------------------");
        seo.sendMoney(kang, 50000);

        shinhan.showAccounts();
        woori.showAccounts();

    }
}
