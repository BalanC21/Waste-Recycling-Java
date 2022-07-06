package com.codecool.dustbin.interfaces;

import com.codecool.dustbin.model.Garbage;

public interface GarbageRepository {
    boolean checkStatus(Garbage garbage);

    void changeStatus(Garbage garbage);

    void setEnumType(Enum<?> enumType);
}
