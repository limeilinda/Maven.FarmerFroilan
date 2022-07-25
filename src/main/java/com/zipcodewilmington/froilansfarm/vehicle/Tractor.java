package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.structure.Farm;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor(){
        super();
    }

    @Override
    public String makeNoise() {
        return "vroom vroom";
    }

    @Override
    public void operate(Farm farm) {

    }

}
