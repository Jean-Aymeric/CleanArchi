package com.nfs.valueobject;

public class ReferenceCoaching {
    public static int NEXT_ID = 0;

    public static int getNextId() {
        return ReferenceCoaching.NEXT_ID++;
    }
    private Reference reference;
    private final int id;

    public ReferenceCoaching(final Reference reference) {
        this.reference = reference;
        this.id = -1;
    }

    public ReferenceCoaching() {
        this.id = ReferenceCoaching.getNextId();
    }

    public int getId() {
        return (this.id == -1) ? this.reference.id() : this.id;
    }
}
