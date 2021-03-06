package day09.objarr;

public class Bank {
    String bankName;

    //등록된 계좌들
    Account[] accounts;

    //총 보유 액수
    int totalCash;

    //등록된 계좌 수
    int accountCount;


    // Constructor
    Bank(String bankName, int accountCount) {
        this.bankName = bankName;
        this.accountCount = 0;
        this.accounts = new Account[accountCount];
    }

    // 신규 계좌 등록 기능
    void registry(Account newAccount) {
        // 등록 가능한지 여부 : 총 계좌 등록 제한개수를 넘지 않았는가
        if (accountCount < accounts.length) {
            accounts[accountCount++] = newAccount;
            System.out.println("신규 계좌가 등록되었습니다.");
        } else {
            System.out.println("더 이상 계좌를 등록할 수 없습니다.");
            return;
        }
    }

    // 등록된 모든 계좌 조회 기능
    void showAccounts() {
        System.out.printf("======= [%s은행] 등록계좌 (총 %d개) =======\n", this.bankName, this.accountCount);
        for (int i = 0; i < this.accountCount; i++) {
            // # 1. 홍길동님 계좌 - 잔액 [100000원]
            // # 2. 김영희님 계좌 - 잔액 [300000원]
            System.out.printf("# %d. %s님 계좌 - 잔액 [%d원]\n", i + 1, accounts[i].owner.name, accounts[i].balance);
        }
    }

//    public static void main(String[] args) {
//        Bank b = new Bank("Yo", 4);
//        Person p = new Person("Julie");
//        b.registry(new Account(p));
//    }
}
