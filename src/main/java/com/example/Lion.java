package com.example;
import java.util.List;

public class Lion {

    public Feline feline;
    public Animal animal;

    public Lion(Feline feline){
        this.feline = feline;
    }
    public Lion(Animal animal){
        this.animal = animal;
    }


    boolean hasMane;

    public Lion (String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }


    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animal.getFood("Хищник");
    }
}
