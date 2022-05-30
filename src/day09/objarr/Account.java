package day09.objarr;

// Bank Account
public class Account {

    String bankName;
    int balance;
    Person owner; // 예금주 정보

    // Constructor
    Account(Person p) {
        this.owner = p;
    }
}
