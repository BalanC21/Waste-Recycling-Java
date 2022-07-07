package com.codecool.dustbin.model;


import com.codecool.dustbin.enums.GarbageType;

public final class PaperDustBin extends DustBin {
    public PaperDustBin(Enum<?> enums, GarbageType paper) {
        super(enums);
        super.setDustBinCategory(paper);
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
        return super.getGarbageList().size() > 20;
    }
}
