package com.codecool.dustbin.model;

import com.codecool.dustbin.interfaces.GarbageRepository;

public abstract sealed class Garbage implements GarbageRepository permits HouseWasteGarbage, PaperGarbage, PlasticGarbage {

    private Enum<?> garbageType;
    private Enum<?> garbageCategory;

    private boolean processedStatus;

    public Enum<?> getGarbageType() {
        return garbageType;
    }

    public boolean isProcessedStatus() {
        return processedStatus;
    }

    public void setEnumType(Enum<?> enumType) {
        this.garbageType = enumType;
    }

    public void setBooleanStatus(Boolean booleanType) {
        this.processedStatus = booleanType;
    }

    public void setGarbageCategory(Enum<?> garbageCategory) {
        this.garbageCategory = garbageCategory;
    }

    public Enum<?> getGarbageCategory() {
        return garbageCategory;
    }
}
