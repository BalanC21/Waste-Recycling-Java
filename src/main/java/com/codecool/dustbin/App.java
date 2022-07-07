package com.codecool.dustbin;

import com.codecool.dustbin.model.Garbage;
import com.codecool.dustbin.model.PaperGarbage;
import com.codecool.dustbin.util.Util;

public class App {
    public static void main(String[] args) {
        Util util = new Util();
        Garbage garbage = new PaperGarbage();
        util.setGarbage(garbage);
    }
}
