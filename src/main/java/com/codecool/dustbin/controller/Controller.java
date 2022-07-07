package com.codecool.dustbin.controller;


import com.codecool.dustbin.enums.GarbageType;
import com.codecool.dustbin.enums.Paper;
import com.codecool.dustbin.enums.Plastic;
import com.codecool.dustbin.enums.WasteEnum;
import com.codecool.dustbin.model.*;
import com.codecool.dustbin.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Controller {
    private final GarbageFactory garbageFactory;

    private final Util util;

    private List<Garbage> garbageList;

    public Controller(GarbageFactory garbageFactory) {
        this.garbageFactory = garbageFactory;
        this.util = garbageFactory.getUtil();
        this.garbageList = new ArrayList<>();
        addGarbageToList();
    }

    private void addGarbageToList() {
        for (int i = 0; i < 100; i++) {
            Garbage garbage = garbageFactory.createGarbage();
            if (Arrays.stream(Paper.values()).anyMatch(e -> e.equals(garbage.getGarbageType())))
                garbage.setGarbageCategory(GarbageType.PAPER);
            if (Arrays.stream(Plastic.values()).anyMatch(e -> e.equals(garbage.getGarbageType())))
                garbage.setGarbageCategory(GarbageType.PLASTIC);
            if (Arrays.stream(WasteEnum.values()).anyMatch(e -> e.equals(garbage.getGarbageType())))
                garbage.setGarbageCategory(GarbageType.HOUSEWASTE);
            garbageList.add(garbage);
        }
    }

    private void manageGarbage(DustBin dustBin) {
        for (Garbage garbage : garbageList) {
            if (dustBin.getDustBinCategory().equals(garbage.getGarbageCategory())) {
                if (garbage.isProcessedStatus()) {
                    dustBin.addToGarbageList(garbage);
                } else {
                    garbage.setBooleanStatus(true);
                    dustBin.addToGarbageList(garbage);
                }
            }
        }
    }

    public void startProcessingGarbage(List<DustBin> dustBins) {
        for (DustBin dustBin : dustBins) {
            System.out.println();
            System.out.printf("Processing %s Dustbin \n", dustBin.getDustBinCategory());
            manageGarbage(dustBin);
            util.display(dustBin);
        }
    }
}
