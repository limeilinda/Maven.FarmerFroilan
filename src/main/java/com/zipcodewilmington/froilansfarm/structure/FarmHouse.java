package com.zipcodewilmington.froilansfarm.structure;

import com.zipcodewilmington.froilansfarm.mammal.Person;
import com.zipcodewilmington.froilansfarm.mammal.animal.Chicken;

import java.util.ArrayList;

public class FarmHouse extends Shelter<Person>{

    public FarmHouse() {
        super.items = new ArrayList<Person>();

    }

}
