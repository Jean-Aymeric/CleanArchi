package com.nfs.entity;

import com.nfs.valueobject.Information;

public class Planning extends EntityCoaching {
    private Information information;

    public Planning(final Information information) {
        super();
        this.information = information;
    }

    public Planning(final String information) {
        this(new Information(information));
    }

    public Information getInformation() {
        return this.information;
    }

    public void setInformation(final Information information) {
        this.information = information;
    }
}
