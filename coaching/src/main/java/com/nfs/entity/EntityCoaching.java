package com.nfs.entity;

import com.nfs.valueobject.ReferenceCoaching;

public class EntityCoaching {
    private final ReferenceCoaching reference;

    public EntityCoaching() {
        this.reference = new ReferenceCoaching();
    }

    public EntityCoaching(final Entity entity) {
        this.reference = new ReferenceCoaching(entity.getReference());
    }
    public int getId() {
        return this.reference.getId();
    }
}
