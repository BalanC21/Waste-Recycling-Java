package com.codecool.dustbin.model;

import com.codecool.dustbin.interfaces.DustbinRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public sealed abstract class DustBin implements DustbinRepository permits HouseWasteDustbin, MegaDustBin, PaperDustBin, PlasticDustBin {

    private final List<Garbage> garbageList;

    private boolean isFull;

    private final Enum<?> color;

    public void setDustBinCategory(Enum<?> dustBinCategory) {
        this.dustBinCategory = dustBinCategory;
    }

    private Enum<?> dustBinCategory;

    public List<Garbage> getGarbageList() {
        return garbageList;
    }

    public Enum<?> getDustBinCategory() {
        return dustBinCategory;
    }

    public void addToGarbageList(Garbage garbage){
        garbageList.add(garbage);
    }

    public DustBin(Enum<?> color) {
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
