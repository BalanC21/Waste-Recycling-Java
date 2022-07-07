package com.codecool.dustbin.model;

public final class MegaDustBin extends DustBin implements com.codecool.dustbin.interfaces.MegaDustBin {
    public MegaDustBin(Enum<?> color) {
        super(color);
    }

    @Override
    public void cleanDustbin() {

    }

    @Override
    public void countGarbage() {

    }

    @Override
    public boolean isFull() {
        return super.getGarbageList().size() == 100;
    }

    @Override
    public void burnGarbage(DustBin dustBin) {

    }
}
