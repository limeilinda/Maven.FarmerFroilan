package com.zipcodewilmington.froilansfarm.product;

import com.zipcodewilmington.froilansfarm.product.edible.Edible;

import java.util.ArrayList;
import java.util.List;

public class CropRow <T extends Crop<? extends Edible>> {
    List<T> crops;

    public CropRow() {
        crops = new ArrayList<>();
    }

    public CropRow(List<T> crops) {
        this.crops = crops;
    }

    public List<T> getCrops() {
        return crops;
    }

    public void setCrops(List<T> crops) {
        this.crops = crops;
    }

    public T getCrop(T crop) {
        try {
            return crops.get(crops.indexOf(crop));
        } catch (NullPointerException e) {
            return null;
        }
    }
}
