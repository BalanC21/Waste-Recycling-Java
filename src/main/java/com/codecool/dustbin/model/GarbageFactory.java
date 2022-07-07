package com.codecool.dustbin.model;

import com.codecool.dustbin.util.Util;

public class GarbageFactory {

    private final Util util;

    public GarbageFactory() {
        this.util = new Util();
    }

    public Util getUtil() {
        return util;
    }

    public Garbage createGarbage() {
        int numberOfGarbage = 3;
        Garbage garbage = null;

        switch (util.randomNumber(numberOfGarbage)) {
            case 0 -> garbage = new PaperGarbage();
            case 1 -> garbage = new PlasticGarbage();
            case 2 -> garbage = new HouseWasteGarbage();
        }

        util.setGarbage(garbage);
        return garbage;
    }
}
