package com.company;

import java.util.ArrayList;

public class OffSpring {

    String name = "";
    ArrayList<String> offSpring = new ArrayList<String>();




    public OffSpring(String name)
        {
            this.name = name;
        }

    @Override
    public String toString() {
        return "OffSpring" + "name'" + name + '\'' ;
    }
}
