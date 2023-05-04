package banking_system;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private ArrayList<ATM> atms;

    public Bank(){
        accounts = new ArrayList<>();
        atms = new ArrayList<>();
    }

    public int createAccount() {
        Account newAccount = new Account(accounts.size());//id of the account is its index in the arraylist
        accounts.add(newAccount);
        return accounts.size() - 1;
    }

    public void attachATM(ATM atm) {
        atms.add(atm);
        atm.setBank(this);
    }
    public int accessAcctInfo(int acctNum) throws Exception{
        if (acctNum >= accounts.size() || acctNum < 0)
            throw new Exception("no account with such number");
        return accounts.get(acctNum).getBalance();
    }

    public void updateAcctBal(int acctNum, int diff) throws Exception {
        if (acctNum >= accounts.size() || acctNum < 0)//if acctNum is not in the range [0, accounts.size())
            throw new Exception("no account with such number");


        if(accounts.get(acctNum).getBalance() + diff < 0)
            throw new Exception("balance can't be negative");
        accounts.get(acctNum).setBalance( diff );
    }
}
