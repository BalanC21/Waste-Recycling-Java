package com.codecool.dustbin.model;

import com.codecool.dustbin.interfaces.DustbinRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public abstract class DustBin implements DustbinRepository {

    private List<Garbage> garbageList;

    private boolean isFull;

    private final Enum<?> color;

    protected DustBin(Enum<?> color) {
        this.color = color;
    }

    public Map<Enum<?>, Long> countDustbinElements(DustBin dustBin) {
        Map<Enum<?>, Long> map = new HashMap<>();

        //todo Trebuie schimbat, nu cred ca e asa!!

        map = (garbageList.parallelStream().collect(Collectors.groupingBy(Garbage::getGarbageType, Collectors.counting())));
        System.out.println(map.size());
        return null;
    }
}
