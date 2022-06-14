package day15.exception;

public class AccMain {

    public static void main(String[] args) {

        Account account = new Account();
        try {
            account.withdraw(10000);
        } catch (Exception e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
