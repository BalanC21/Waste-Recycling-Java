package com.codecool.dustbin.model;

import com.codecool.dustbin.util.Util;

public class GarbageFactory {

    private final Util util;

    public GarbageFactory(Util util) {
        this.util = util;
    }

    public Garbage createGarbage() {
        Garbage garbage = null;
        switch (util.randomNumber()) {
            case 0 -> {
                garbage = new PaperGarbage();
                util.setGarbage(garbage);
            }
            case 1 -> {
                garbage = new PlasticGarbage();
                util.setGarbage(garbage);
            }
            case 2 -> {
                garbage = new HouseWasteGarbage();
                util.setGarbage(garbage);
            }
        }
        return garbage;
    }
}
