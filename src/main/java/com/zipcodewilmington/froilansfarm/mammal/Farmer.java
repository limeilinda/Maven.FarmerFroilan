package com.zipcodewilmington.froilansfarm.mammal;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.mammal.animal.Horse;
import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.CropRow;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;
import com.zipcodewilmington.froilansfarm.structure.Farm;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Botanist, Rider {

    Farm farm;
    Rideable ride;
    Crop crop;





    public Farmer(){
        super();
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public <T extends Crop<? extends Edible>> void plantCrops(T crop, CropRow<T> row) {
        this.crop = crop;
        row.add(crop);

    }


    @Override
    public <T extends Rideable> void mount(T Rideable) {
        this.ride = Rideable;
    }

    @Override
    public <T extends Rideable> void dismount(T Rideable) {
        this.ride = null;
    }

    public Boolean riderStatus() {
        if(this.ride==null){
            return false;
        }
        return true;
    }

}
