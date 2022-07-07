package com.codecool.dustbin.model;

import com.codecool.dustbin.enums.GarbageType;

public final class PlasticDustBin extends DustBin {

    public PlasticDustBin(Enum<?> enums, GarbageType plastic) {
        super(enums);
        super.setDustBinCategory(plastic);
    }

    @Override
    public void clearDustbin() {
        if (isFull()) {
            System.out.println("Dustbin Was Cleared");
            super.getGarbageList().clear();
        }
    }

    @Override
    public boolean isFull() {
        return super.getGarbageList().size() > 10;
    }
}
