package com.codecool.dustbin.model;

import com.codecool.dustbin.interfaces.DustbinRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public abstract class DustBin implements DustbinRepository {

    private final List<Garbage> garbageList;

    private boolean isFull;

    private final Enum<?> color;

    public List<Garbage> getGarbageList() {
        return garbageList;
    }

    protected DustBin(Enum<?> color) {
        this.color = color;
        this.garbageList = new ArrayList<>();
    }

    public Map<Enum<?>, Long> countDustbinElements(DustBin dustBin) {
        Map<Enum<?>, Long> map;

        //todo Trebuie schimbat, nu cred ca e asa!!

        map = (garbageList.parallelStream().collect(Collectors.groupingBy(Garbage::getGarbageType, Collectors.counting())));
        System.out.println(map.size());

        return map;
    }


}
