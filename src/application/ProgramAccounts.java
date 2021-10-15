package application;

import entities.Account2;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccounts {
    public static void main(String[] args) {

        Account2 acc = new Account2(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Anna", 0.0, 0.01);

        // UPCASTING
        Account2 acc1 = bacc;
        Account2 acc2 = new BusinessAccount(1002, "Bob", 0.0, 200.0);
        Account2 acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc6 = (SavingsAccount)acc3;
        }
    }
}
