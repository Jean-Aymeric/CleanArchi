package com.nfs.valueobject;

public record Reference(int id) {
    public static int NEXT_ID = 0;
    public static int getNextId() {
        return Reference.NEXT_ID++;
    }
}
