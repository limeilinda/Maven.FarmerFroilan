package com.zipcodewilmington.froilansfarm.structure;


import java.util.List;

public abstract class Shelter<T> {
    List<T> items;

    public List<T> getAll() {
        return items;
    }

    public void setAll(List<T> items) {
        this.items = items;
    }


    public void add(T item){
        items.add(item);
    }

    public void remove(T item) {
        items.remove(item);
    }


    public T get(T item) {
        if (items.contains(item)) {
            return item;
        }

        return null;
    }

}
