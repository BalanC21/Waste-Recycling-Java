package com.codecool.dustbin.interfaces;

import com.codecool.dustbin.model.Garbage;

public interface GarbageRepository {
    boolean checkStatus(Garbage garbage);

    void changeProcessedStatus(Garbage garbage);

}
