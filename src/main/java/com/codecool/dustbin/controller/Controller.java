package com.codecool.dustbin.controller;


import com.codecool.dustbin.model.*;
import com.codecool.dustbin.util.Util;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    private final GarbageFactory garbageFactory;

    private final Util util;

    private List<Garbage> garbageList;

    public List<Garbage> getGarbageList() {
        return garbageList;
    }

    public Controller(GarbageFactory garbageFactory) {
        this.garbageFactory = garbageFactory;
        this.util = new Util();
        this.garbageList = new ArrayList<>();
        addGarbageToList();
    }

    public void addGarbageToList() {
        for (int i = 0; i < 100; i++) {
            Garbage garbage = garbageFactory.createGarbage();
            garbageList.add(garbage);
        }
    }

    public void manageGarbage(DustBin dustBin) {
        for (Garbage garbage : garbageList) {
            if (dustBin instanceof PaperDustBin && garbage instanceof PaperGarbage)
                dustBin.addToGarbageList(garbage);
            if (dustBin instanceof PlasticDustBin && garbage instanceof PlasticGarbage)
                dustBin.addToGarbageList(garbage);
            if (dustBin instanceof HouseWasteDustbin && garbage instanceof HouseWasteGarbage)
                dustBin.addToGarbageList(garbage);
        }
    }
}
