package com.codecool.dustbin.model;


import com.codecool.dustbin.interfaces.DustbinRepository;

public class HouseWasteDustbin extends DustBin implements DustbinRepository {

    protected HouseWasteDustbin(Enum<?> enums) {
        super(enums);
    }

    @Override
    public void cleanDustbin() {

    }

    @Override
    public void countGarbage() {

    }
}
