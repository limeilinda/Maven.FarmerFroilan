package com.zipcodewilmington.froilansfarm.vehicle;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft{
    public void fly() {};

    @Override
    public String makeNoise() {
        return null;
    }
}
