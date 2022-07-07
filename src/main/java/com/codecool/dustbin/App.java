package com.codecool.dustbin;

import com.codecool.dustbin.controller.Controller;
import com.codecool.dustbin.model.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
        GarbageFactory garbageFactory = new GarbageFactory();
        DustBinFactory dustBinFactory = new DustBinFactory();
        List<DustBin> dustBinList = dustBinFactory.generateDustBins();

        Controller controller = new Controller(garbageFactory);
        controller.startProcessingGarbage(dustBinList);
    }
}
