package com.zipcodewilmington.froilansfarm.mammal;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater {

    ArrayList<Edible> foodEaten;
    String name;

    public Person(){
        foodEaten = new ArrayList<>();
    }
    public Person(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String makeNoise(){
        return "Hello!";
    }

    public <T extends Edible> void eat(T crop) {
        foodEaten.add(crop);
    }
    public Boolean hasEaten(Edible edible) {
        if(foodEaten.contains(edible)){
            return true;
        }
        return null;
    }



}
