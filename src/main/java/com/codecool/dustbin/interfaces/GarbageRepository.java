package com.codecool.dustbin.interfaces;

import com.codecool.dustbin.model.Garbage;

public interface GarbageRepository {

    void changeProcessedStatus(Garbage garbage);

}
