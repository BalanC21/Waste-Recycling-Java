package com.codecool.dustbin.model;

public final class MegaDustBin extends DustBin implements com.codecool.dustbin.interfaces.MegaDustBin {
    public MegaDustBin(Enum<?> color) {
        super(color);
    }

    @Override
    public void clearDustbin() {

    }

    @Override
    public boolean isFull() {
        return super.getGarbageList().size() == 10000;
    }

    @Override
    public void burnGarbage(DustBin dustBin) {
        dustBin.getGarbageList().clear();
    }
}
