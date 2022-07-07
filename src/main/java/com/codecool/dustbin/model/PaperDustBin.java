package com.codecool.dustbin.model;


import com.codecool.dustbin.enums.GarbageType;

public class PaperDustBin extends DustBin {
    public PaperDustBin(Enum<?> enums, GarbageType paper) {
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
        return super.getGarbageList().size() > 20;
    }
}
