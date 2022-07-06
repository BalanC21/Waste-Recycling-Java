package com.codecool.dustbin.util;

import com.codecool.dustbin.enums.Paper;
import com.codecool.dustbin.enums.Plastic;
import com.codecool.dustbin.model.DustBin;
import com.codecool.dustbin.model.Garbage;
import com.codecool.dustbin.model.PlasticGarbage;

import java.util.Arrays;
import java.util.Random;

public class Util {
    Random random;

    public Util() {
        this.random = new Random();
    }

    private Object[] getEnumClass(Class<Garbage> garbage) {
        return Paper.class.getEnumConstants();

    }

    public Enum<?> setEnumType(Class<?> enums) {
        return Plastic.PLASTICBAG;
    }

    public boolean getBoolean(Garbage garbage) {
        return true;
    }

    public Class<Garbage> readGarbageClass(Garbage garbage) {
//        return garbage.getClass();
        return null;
    }

    public int countDustbinElements(DustBin dustBin) {
        return 0;
    }

    public void TestAna(){
        Garbage garbage = new PlasticGarbage();
        Class<Garbage> garbageClass = readGarbageClass(garbage);
        Object[] enumClass = getEnumClass(garbageClass);
        System.out.println(Arrays.toString(enumClass));
        for (Object aClass : enumClass) {
            System.out.println(aClass.getClass().getSimpleName());
        }
    }
}
