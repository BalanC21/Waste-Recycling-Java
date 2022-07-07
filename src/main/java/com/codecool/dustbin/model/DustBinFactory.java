package com.codecool.dustbin.model;

import com.codecool.dustbin.enums.Color;
import com.codecool.dustbin.enums.GarbageType;

import java.util.*;

public class DustBinFactory {

    public List<DustBin> generateDustBins(){
        List<DustBin> dustBinList = new ArrayList<>();
        DustBin paperDustBin = new PaperDustBin(Color.GREEN, GarbageType.PAPER);
        DustBin plasticDustBin = new PlasticDustBin(Color.YELLOW, GarbageType.PLASTIC);
        DustBin houseWasteDustBin = new HouseWasteDustbin(Color.BLUE, GarbageType.HOUSEWASTE);

        dustBinList.add(paperDustBin);
        dustBinList.add(plasticDustBin);
        dustBinList.add(houseWasteDustBin);

        return dustBinList;
    }
}
