package com.nfs.entity;

import com.nfs.valueobject.Label;

public class Stuff extends Entity {
    private Label label;

    public Stuff(final Label label) {
        super();
        this.label = label;
    }

    public Stuff(final String label) {
        this(new Label(label));
    }

    public Label getLabel() {
        return this.label;
    }

    public void setLabel(final Label label) {
        this.label = label;
    }
}
