package com.company;

import java.util.ArrayList;

public class Dog {
    String name = "";
    Owner owner;
    boolean isHungery = true;
    ArrayList<OffSpring> offSpring = new ArrayList<OffSpring>();

    public Dog(String name, boolean isHungery) {
        this.name = name;
        this.isHungery = true;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner( Owner owner) {
        this.owner = owner;
    }


    public java.util.ArrayList<OffSpring> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(java.util.ArrayList<OffSpring> offSpring)
    {
        this.offSpring = offSpring;
    }
}
//public void feedDog(boolean isHungery)
//{
//  for (int i =0; )
//}
//}

