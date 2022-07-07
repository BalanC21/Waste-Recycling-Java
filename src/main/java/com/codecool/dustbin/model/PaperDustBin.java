package com.codecool.dustbin.model;


public class PaperDustBin extends DustBin {
    public PaperDustBin(Enum<?> enums) {
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
