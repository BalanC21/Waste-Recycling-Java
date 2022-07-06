package com.codecool.dustbin.model;

public class PlasticGarbage extends Garbage {
    @Override
    public boolean checkStatus(Garbage garbage) {
        return false;
    }

    @Override
    public void changeProcessedStatus(Garbage garbage) {

    }
}
