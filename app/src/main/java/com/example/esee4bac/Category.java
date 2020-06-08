package com.example.esee4bac;

import androidx.annotation.NonNull;

////
public class Category {
    public static final int HARAP_ALB = 1;
    public static final int MOARA_CU_NOROC = 2;
    public static final int ALEXANDRU_L = 3;
    public static final int ION = 4;
    public static final int BALTAGUL = 5;
    public static final int ULTIMA_NOAPTE = 6;
    public static final int MAITREYI = 7;
    public static final int ENIGMA_OTILIEI = 8;
    public static final int MOROMETII = 9;

    private int id;
    private String name;

    public Category() {}

    public Category(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
