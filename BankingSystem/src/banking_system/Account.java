package banking_system;

public class Account {

    private int number;
    private int balance;

    //all methods have a default access level. Only classes in the
    // "bank_system" package can access them
    Account(int id) {
        number = id;
        balance = 0;
    }

    int getId() {
        return number;
    }

    int getBalance() {
        return balance;
    }

    void setBalance(int n) {
        balance += n;
    }
}

