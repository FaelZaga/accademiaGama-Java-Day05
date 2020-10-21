package main.java.com.brito.ArrayTest;

import main.java.com.brito.ArrayTest.entities.Account;

public class ArrayTest {

    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        double totalBalance = 0;

        for (int i=0; i<accounts.length; i++) {
            accounts[0] = new Account(i*100);
            System.out.println(accounts[0]);
        }

        for (int i=0; i<accounts.length; i++) {
            totalBalance += accounts[0].getBalance();
        }

        System.out.println(averageCalc(totalBalance,accounts.length));

    }

    public static double averageCalc(double value, int times) {
        return value/times;
    }

}
