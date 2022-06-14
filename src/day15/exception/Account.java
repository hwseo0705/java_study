package day15.exception;

public class Account {

    String owner;
    int balance;

    public void withdraw(int money) throws Exception {
        if (balance < money) {
            // throw
            throw new BalanceInsufficientException("Insufficient Balance");
        }
        this.balance -= money;
    }
}
