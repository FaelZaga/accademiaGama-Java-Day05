package main.java.com.brito.ArrayTest.entities;

import java.util.Arrays;

public class Bank {
    public String name;
    private int number;
    private Account[] accounts = new Account[10];

    public boolean addAccount(Account account) {
        for (int i=0; i < this.accounts.length; i++) {
            if (this.accounts[i] == null){
                this.accounts[i] = account;
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
