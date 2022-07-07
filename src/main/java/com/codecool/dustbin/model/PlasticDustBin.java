package com.codecool.dustbin.model;

import com.codecool.dustbin.enums.GarbageType;

public class PlasticDustBin extends DustBin {

    public PlasticDustBin(Enum<?> enums, GarbageType plastic) {
        super(enums);
    }

    @Override
    public void cleanDustbin() {
    }

    @Override
    public void countGarbage() {
    }

    @Override
    public boolean isFull() {
        return super.getGarbageList().size() > 10;
    }
}
