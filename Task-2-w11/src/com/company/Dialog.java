package com.company;

import java.util.Scanner;

public class Dialog extends Controller {


    public double Dialog()
    {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast varens pris: ");
        double number = myScan.nextDouble();
        return number;
    }
}
