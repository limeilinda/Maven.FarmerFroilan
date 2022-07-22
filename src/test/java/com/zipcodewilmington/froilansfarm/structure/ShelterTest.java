package com.zipcodewilmington.froilansfarm.structure;


import com.zipcodewilmington.froilansfarm.mammal.Person;
import com.zipcodewilmington.froilansfarm.mammal.animal.Chicken;
import com.zipcodewilmington.froilansfarm.mammal.animal.Horse;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShelterTest {
    Shelter<Chicken> chickenCoop;
    Shelter<Horse> Stable;
    Shelter<Person> Person;



    @BeforeEach
    public void init() {
        ChickenCoop testCoop = new ChickenCoop();
        Stable testsStable = new Stable();


    }

//    @Test
//    void Constructor() {
//
//        super.items = new ChickenCoop(false, true, new Chicken());
//        Boolean actual = carrotRootCrop.isHarvested();
//        Assert.assertFalse(actual);
//
//    }

    @Test
    void getAll() {
    }

    @Test
    void setAll() {
    }

    @Test
    void add() {
    }

    @Test
    void remove() {
    }

    @Test
    void get() {
    }
}