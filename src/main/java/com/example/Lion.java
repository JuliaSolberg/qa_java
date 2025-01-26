package com.example;

import java.util.List;

public class Lion {

    private Felidae felidae;
    boolean hasMane;

  /*  public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    } */

    public Lion(Feline feline, String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
        this.felidae = feline;
}

  //  Feline feline = new Feline();

    public int getKittens() {
        return felidae.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felidae.getFood("Хищник");
    }
}
