package outside;
import banking_system.*;
public class Customer {
    private Bank bank;
    private ATM atm;
    private int acc_number;

    public Customer(Bank customerBank, ATM customerAtm) {
        bank = customerBank;
        atm = customerAtm;
    }

    public void openAccount() {
        acc_number = bank.createAccount();
    }

    public boolean depositMoney(int amount) {//returns true if the process was successful else false
        if( !atm.loginToAccount(acc_number) )
            return false;
        if( !atm.deposit( amount ))
            return false;
        atm.logout();
        return true;
    }

    public boolean withdrawMoney(int amount) {//returns true if the action was successful else false
        if( !atm.loginToAccount(acc_number) )
            return false;
        if(!atm.withdraw( amount )) {
            return false;
        }
        atm.logout();
        return true;
    }

    public int checkBalance() {
        boolean islogged = atm.loginToAccount(acc_number);
        if( !islogged )
            return 0;
        int balance = atm.getBalance();
        atm.logout();
        return balance;
    }
}
