package com.codecool.dustbin.util;

import com.codecool.dustbin.enums.Paper;
import com.codecool.dustbin.enums.Plastic;
import com.codecool.dustbin.enums.WasteEnum;
import com.codecool.dustbin.model.*;

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

    private Enum<?> getEnumType(Object[] enums) {
        if (enums.length == 0)
            throw new NullPointerException("Enums List Is Empty Or Enums List Is Wrong Provided!");
        return (Enum<?>) enums[random.nextInt(enums.length)];
    }

    private boolean getBoolean() {
        return random.nextBoolean();
    }

    private String readGarbageClass(Garbage garbage) {
            return garbage.getClass().getSimpleName();
    }

    public int countDustbinElements(DustBin dustBin) {
        return 0;
    }

    public void setGarbage(Garbage garbage){
        String readGarbageClass = readGarbageClass(garbage);
        Object[] getEnumClass = getEnumClass(readGarbageClass);
        Enum<?> getEnumType = getEnumType(getEnumClass);
        Boolean booleanType = getBoolean();
        garbage.setEnumType(getEnumType);
        garbage.setBoolean(booleanType);

    }
}
