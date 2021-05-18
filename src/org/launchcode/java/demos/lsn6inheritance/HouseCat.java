package org.launchcode.java.demos.lsn6inheritance;

import org.launchcode.java.demos.lsn6inheritance.Cat;


public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public class Main {
        public void main(String[] args) {
            HouseCat garfield = new HouseCat("Garfield", 12);
            garfield.eat();
            System.out.println(garfield.isTired());   // prints true
        }
    }


    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}

