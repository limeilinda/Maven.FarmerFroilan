package com.zipcodewilmington.froilansfarm.structure;

import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.CropRow;
import com.zipcodewilmington.froilansfarm.product.edible.Edible;

import java.util.ArrayList;
import java.util.List;

public class Field {
    List<CropRow<? extends Crop<? extends Edible>>> cropRows;

    public Field() {
        cropRows = new ArrayList<>();
    }

    public List<CropRow<? extends Crop<? extends Edible>>> getCropRows() {
        return cropRows;
    }

    public void setCropRows(List<CropRow<? extends Crop<? extends Edible>>> cropRows) {
        this.cropRows = cropRows;
    }
}
