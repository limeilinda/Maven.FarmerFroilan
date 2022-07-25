package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.CropRow;
import com.zipcodewilmington.froilansfarm.structure.Farm;
import com.zipcodewilmington.froilansfarm.structure.Field;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft{

    public CropDuster(){
        super();
    }

    @Override
    public String makeNoise() {
        return "roar";
    }


    @Override
    public void operate(Farm farm) {

    }
}
