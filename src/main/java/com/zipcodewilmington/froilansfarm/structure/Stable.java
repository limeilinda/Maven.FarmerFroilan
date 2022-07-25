package com.zipcodewilmington.froilansfarm.structure;

import com.zipcodewilmington.froilansfarm.mammal.animal.Horse;

import java.util.ArrayList;

public class Stable extends Shelter<Horse> {

    public Stable () {
        super.items = new ArrayList<Horse>();
    }

}
