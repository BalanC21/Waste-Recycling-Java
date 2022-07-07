package com.codecool.dustbin.model;

public class MegaDustBin extends DustBin implements com.codecool.dustbin.interfaces.MegaDustBin {
    protected MegaDustBin(Enum<?> color) {
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
        return false;
    }

    @Override
    public void burnGarbage(DustBin dustBin) {

    }
}
