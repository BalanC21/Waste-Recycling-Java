package com.codecool.dustbin.model;


public final class HouseWasteGarbage extends Garbage {

    @Override
    public void changeProcessedStatus(Garbage garbage) {
        System.out.println(this.isProcessedStatus());
        System.out.println(super.isProcessedStatus());
        garbage.setBooleanStatus(true);
    }

    @Override
    public void setEnumType(Enum<?> enumType) {
        System.out.println(this.getGarbageType());
        System.out.println(super.getGarbageType());
        super.setEnumType(enumType);
    }
}
