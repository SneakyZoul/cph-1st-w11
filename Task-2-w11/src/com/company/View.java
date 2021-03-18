package com.company;

public class View  {
    final static String CURRENCY = "Kr";
    final static String MSG = "MOMS";

    public void View(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);
    }
}
