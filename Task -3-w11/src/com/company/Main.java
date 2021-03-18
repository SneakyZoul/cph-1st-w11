package com.company;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Account> myAccount = new ArrayList<>();

    public static void main(String[] args) {
        Account account1 = new Account("Bob", "Master_card", 4593781145107322l, "Germany");
        Account account2 = new Account("Viktor", "Visa", 4353722145237322l, "Denmark");
        Account account3 = new Account("Mikkel", "Visa", 4691284445807399l, "Norway");
        Account account4 = new Account("Sarah", "DK_Visa", 3793383311802199l, "Bornholm");


        myAccount.add(account1);
        myAccount.add(account2);
        myAccount.add(account3);
        System.out.println(myAccount.get(0));



    }
}
