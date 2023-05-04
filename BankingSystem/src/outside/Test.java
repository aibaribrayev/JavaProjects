package outside;
import banking_system.*;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ATM atm1 = new ATM();
        ATM atm2 = new ATM();

        bank.attachATM(atm1);
        bank.attachATM(atm2);

        Customer cust1 = new Customer(bank, atm1);
        Customer cust2 = new Customer(bank, atm2);

        cust1.openAccount();
        cust2.openAccount();

        if (cust1.depositMoney(1212)){
            System.out.println("successfully deposited cust1's money");
        }

        if (cust1.withdrawMoney(800)){
            System.out.println("cust1 successfully withdrawed money");
        }


        System.out.println("current balance on cst1 account: " + cust1.checkBalance());

        if (cust2.depositMoney(2300)){
            System.out.println("successfully deposited cust2's money");
        }

        if (cust2.withdrawMoney(2300)){
            System.out.println("cust2 successfully withdrawed money");
        }

        System.out.println("current balance on cst1 account: " + cust2.checkBalance());
    }
}