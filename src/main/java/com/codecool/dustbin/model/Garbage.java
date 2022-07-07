package com.codecool.dustbin.model;

import com.codecool.dustbin.interfaces.GarbageRepository;

public abstract class Garbage implements GarbageRepository {

    private Enum<?> garbageType;

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

    public void setBoolean(Boolean booleanType) {
        this.processedStatus = booleanType;
    }
}
