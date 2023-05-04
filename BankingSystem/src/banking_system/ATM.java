package banking_system;

public class ATM {
    private Bank attached_bank;
    private int sessionAccount;

    public ATM() {
        attached_bank = null;
        sessionAccount = -1;//id of the currently logged account
                            // when no one is logged the id is invalid
    }
    void setBank(Bank bank) {
        attached_bank = bank;
    } //default access level so that only bank can call it
    public boolean loginToAccount(int acctNum) {
        try {
            attached_bank.accessAcctInfo(acctNum);
        } catch(Exception e) {
            return false;
        }

        sessionAccount = acctNum;
        return true;
    }

    public boolean deposit(int amount) {
        try {
            attached_bank.updateAcctBal(sessionAccount, amount);
        } catch(Exception e) {
            return false;
        }
        return true;
    }

    public boolean withdraw(int amount) {
        try {
            attached_bank.updateAcctBal(sessionAccount, amount*(-1));//since sessionAccount is -1 when
            // no one is logged in Exception is thrown
        } catch(Exception e) {
            return false;
        }
        return true;
    }

    public int getBalance() {
        int balance = 0;
        try {
            balance = attached_bank.accessAcctInfo(sessionAccount);
        } catch( Exception ignored) {}

        return balance;//returns zero if Exception is caught
        //else returns sessionAccount balance
    }

    public void logout() {
        sessionAccount = -1;
    }
}
