package com.codecool.dustbin;

import com.codecool.dustbin.controller.Controller;
import com.codecool.dustbin.model.*;
import com.codecool.dustbin.util.Util;

public class App {
    public static void main(String[] args) {
        GarbageFactory garbageFactory = new GarbageFactory();
        DustBinFactory dustBinFactory = new DustBinFactory();

        Controller controller = new Controller(garbageFactory);
        controller.startProcessingGarbage(dustBinFactory.generateDustBins());
    }
}
