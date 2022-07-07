package com.codecool.dustbin.model;

public class PlasticDustBin extends DustBin {

    public PlasticDustBin(Enum<?> enums) {
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
