package com.codecool.dustbin.model;

import com.codecool.dustbin.interfaces.DustbinRepository;

import java.util.Optional;

public abstract class DustBin implements DustbinRepository {

    private boolean isFull;

    private final Enum<?> color;

    protected DustBin(Enum<?> color) {
        this.color = color;
    }
}
