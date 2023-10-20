package com.nfs.entity;

import com.nfs.valueobject.Reference;

public abstract class Entity {
    private final Reference reference;

    public Entity() {
        this.reference = new Reference(Reference.getNextId());
    }

    public int getId() {
        return this.reference.id();
    }

    public Reference getReference() {
        return this.reference;
    }
}
