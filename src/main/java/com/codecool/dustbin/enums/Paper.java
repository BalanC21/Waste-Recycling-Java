package com.codecool.dustbin.enums;

public enum Paper {
    PAPER(1),
    BOOK(2),
    DRAFT(3);

    final int length;
    public int getLength(int length){
        return length;
    }

    Paper(int length){
        this.length = length;
    }
}
