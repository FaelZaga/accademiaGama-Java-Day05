package main.java.com.brito.ArrayTest;

import main.java.com.brito.ArrayTest.entities.Account;
import main.java.com.brito.ArrayTest.entities.Bank;

public class ProgramBank {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account = new Account();
        account.setBalance(1000.00);

        for (int i=0; i< 11; i++) {
            if (bank.addAccount(account)){
                System.out.println("Account created!");
            }else{
                System.out.println("The bank is full!");
            }
        }

    }
}
