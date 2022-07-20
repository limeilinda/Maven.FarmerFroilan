package com.zipcodewilmington.froilansfarm.structure;

import com.zipcodewilmington.froilansfarm.product.Crop;
import com.zipcodewilmington.froilansfarm.product.CropRow;

import java.util.List;

public class Field {
    List<CropRow<? extends Crop>> cropRows;
}
