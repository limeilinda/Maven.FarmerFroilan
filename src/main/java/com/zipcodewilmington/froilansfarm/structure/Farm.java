package com.zipcodewilmington.froilansfarm.structure;

import com.zipcodewilmington.froilansfarm.mammal.animal.Chicken;
import com.zipcodewilmington.froilansfarm.product.edible.*;
import com.zipcodewilmington.froilansfarm.vehicle.Aircraft;
import com.zipcodewilmington.froilansfarm.vehicle.FarmVehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    List<Stable> stables;
    List<ChickenCoop> coops;
    List<Field> fields;
    List<? extends FarmVehicle> vehicles;
    Aircraft aircraft;
    Map<String, FoodBox<? extends Edible>> foodStorage;

    public Farm() {
        this.stables = new ArrayList<>();
        this.coops = new ArrayList<>();
        this.fields = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        foodStorage = new HashMap<>();
        foodStorage.put("egg", new FoodBox<Egg>());
        foodStorage.put("tomato", new FoodBox<Tomato>());
        foodStorage.put("corn", new FoodBox<EarCorn>());
        foodStorage.put("carrot", new FoodBox<CarrotRoot>());
    }

    public List<Stable> getStables() {
        return stables;
    }

    public void setStables(List<Stable> stables) {
        this.stables = stables;
    }

    public List<ChickenCoop> getCoops() {
        return coops;
    }

    public void setCoops(List<ChickenCoop> coops) {
        this.coops = coops;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<? extends FarmVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<? extends FarmVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Map<String, FoodBox<? extends Edible>> getFoodStorage() {
        return foodStorage;
    }

    public void setFoodStorage(Map<String, FoodBox<? extends Edible>> foodStorage) {
        this.foodStorage = foodStorage;
    }

    public Edible getFood(String food) {
        switch (food.toLowerCase()) {
            case "tomato":
                return foodStorage.get("tomato").getUneatenFoodItem();
            case "egg":
                return foodStorage.get("egg").getUneatenFoodItem();
            case "corn":
                return foodStorage.get("corn").getUneatenFoodItem();
            case "carrot":
                return foodStorage.get("carrot").getUneatenFoodItem();
        }
        return null;
    }
}
