package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog("woodie", true);
        // sæt en ejer
        myDog.setOwner( new Owner("Henning"));
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.getOffSpring().add(new OffSpring("woodiesnoopie"));
        myDog.getOffSpring().add(new OffSpring("woodiesfido"));

        // print alle hvalpe
        ArrayList<OffSpring> myOff = myDog.getOffSpring();
        for (OffSpring myD: myOff) {
            System.out.println(myD);
        }
        System.out.println(Arrays.toString(myOff));
        // print ejeren
         System.out.println("hunden " + myDog.name +  " er ejet af " + myDog.getOwner());
        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        //  String resString = myDog.feedDog();
         System.out.println(resString);
    }
}
