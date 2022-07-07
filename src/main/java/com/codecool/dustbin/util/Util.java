package com.codecool.dustbin.util;

import com.codecool.dustbin.enums.Paper;
import com.codecool.dustbin.enums.Plastic;
import com.codecool.dustbin.enums.WasteEnum;
import com.codecool.dustbin.model.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Util {
    private final Random random;

    public Util() {
        this.random = new Random();
    }

    private Object[] getEnumClass(String garbageType) {
        if (garbageType.equals(PlasticGarbage.class.getSimpleName()))
            return Plastic.class.getEnumConstants();
        else if (garbageType.equals(PaperGarbage.class.getSimpleName())) {
            return Paper.class.getEnumConstants();
        }
        else if (garbageType.equals(HouseWasteGarbage.class.getSimpleName())) {
            return WasteEnum.class.getEnumConstants();
        }
        throw new NullPointerException("Garbage Type Is Null!" );
    }

    public Enum<?> getEnumType(Object[] enums) {
        if (enums.length == 0)
            throw new NullPointerException("Enums List Is Empty!");
        return (Enum<?>) enums[random.nextInt(enums.length)];
    }

    public boolean getBoolean() {
        return random.nextBoolean();
    }

    private String readGarbageClass(Garbage garbage) {
            return garbage.getClass().getSimpleName();
    }

    public int countDustbinElements(DustBin dustBin) {
        return 0;
    }

    public void TestAna(){
        Garbage garbage = new HouseWasteGarbage();
        String readGarbageClass = readGarbageClass(garbage);
        Object[] getEnumClass = getEnumClass(readGarbageClass);
        System.out.println(Arrays.toString(getEnumClass));
        Enum<?> getEnumType = getEnumType(getEnumClass);
        Boolean booleanType = getBoolean();
        System.out.println(booleanType);
        System.out.println(getEnumType);
        System.out.println(getEnumType.getClass().getSimpleName() + " Enum Class Type");

    }
}
