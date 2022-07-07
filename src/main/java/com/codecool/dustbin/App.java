package com.codecool.dustbin;

import com.codecool.dustbin.enums.Color;
import com.codecool.dustbin.model.*;
import com.codecool.dustbin.util.Util;

public class App {
    public static void main(String[] args) {
        Util util = new Util();
        GarbageFactory garbageFactory = new GarbageFactory(util);
        DustBin paperDustBin = new PaperDustBin(Color.GREEN);
        DustBin plasticDustBin = new PlasticDustBin(Color.YELLOW);
        DustBin houseWasteDustBin = new HouseWasteDustbin(Color.BLUE);
    }
}
