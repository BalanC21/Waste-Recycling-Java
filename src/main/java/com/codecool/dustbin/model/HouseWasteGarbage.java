package com.codecool.dustbin.model;


public final class HouseWasteGarbage extends Garbage {

    @Override
    public void changeProcessedStatus(Garbage garbage) {
        super.setBooleanStatus(true);
    }

    @Override
    public void setEnumType(Enum<?> enumType) {
        super.setEnumType(enumType);
    }
}
