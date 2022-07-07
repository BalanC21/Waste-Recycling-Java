package com.codecool.dustbin.interfaces;

public interface DustbinRepository {

    void cleanDustbin();

    void countGarbage();

    boolean isFull();
}
