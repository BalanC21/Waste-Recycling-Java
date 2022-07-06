package com.codecool.dustbin.model;

import com.codecool.dustbin.interfaces.GarbageRepository;

public abstract class Garbage implements GarbageRepository {

    private Enum<?> garbageType;

    private boolean processedStatus;
}
