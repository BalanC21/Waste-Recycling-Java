package com.codecool.dustbin.model;


import com.codecool.dustbin.enums.GarbageType;
import com.codecool.dustbin.interfaces.DustbinRepository;

public final class HouseWasteDustbin extends DustBin implements DustbinRepository {

    public HouseWasteDustbin(Enum<?> enums, GarbageType housewaste) {
        super(enums);
        super.setDustBinCategory(housewaste);
    }

    @Override
    public void clearDustbin() {
        if (isFull()) {
            System.out.println("Dustbin Was Cleared\n");
            super.getGarbageList().clear();
        }

    }

    @Override
    public boolean isFull() {
        return super.getGarbageList().size() == 15;
    }
}
