package com.codecool.dustbin.model;

public class PaperGarbage extends Garbage {
    @Override
    public boolean checkStatus(Garbage garbage) {
        return false;
    }

    @Override
    public void changeProcessedStatus(Garbage garbage) {

    }

    @Override
    public void setEnumType(Enum enumType) {

    }
}
