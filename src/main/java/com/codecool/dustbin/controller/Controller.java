package com.codecool.dustbin.controller;


import com.codecool.dustbin.model.*;
import com.codecool.dustbin.util.Util;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    private final GarbageFactory garbageFactory;

    private final Util util;

    private List<Garbage> garbageList;

    public Controller(GarbageFactory garbageFactory) {
        this.garbageFactory = garbageFactory;
        this.util = new Util();
        this.garbageList = new ArrayList<>();
        addGarbageToList();
    }

    private void addGarbageToList() {
        for (int i = 0; i < 100; i++) {
            Garbage garbage = garbageFactory.createGarbage();
            garbageList.add(garbage);
        }
    }

    private void manageGarbage(DustBin dustBin) {
        for (Garbage garbage : garbageList) {
            if (dustBin.getDustBinCategory().equals(garbage.getGarbageCategory()))
                if (garbage.isProcessedStatus()) {
                    dustBin.addToGarbageList(garbage);
                    System.out.println("Garbage Was Thrown!");
                }
                else {
                    garbage.setBooleanStatus(true);
                    dustBin.addToGarbageList(garbage);
                    System.out.println("Garbage Was Processed And Thrown!");
                }
            garbageList.remove(garbage);
        }
    }

    public void startProcessingGarbage(DustBin[] dustBins){
        for (DustBin dustBin : dustBins) {
            System.out.printf("Processing %s Dustbin", dustBin.getDustBinCategory());
            manageGarbage(dustBin);
            Util.display(dustBin);
        }
    }
}
