package com.nfs.entity;

import com.nfs.valueobject.Label;
import com.nfs.valueobject.Size;

public class StuffCoaching extends EntityCoaching {
    private final Stuff stuff;
    private Size size;

    public StuffCoaching(final Stuff stuff, final Size size) {
        super(stuff);
        this.stuff = stuff;
        this.size = size;
    }

    public StuffCoaching(final String stuff, final Size size) {
        this(new Stuff(stuff), new Size(0));
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(final Size size) {
        this.size = size;
    }

    public Label getLabel() {
        return this.stuff.getLabel();
    }

    public void setLabel(final Label label) {
        this.stuff.setLabel(label);
    }

    public int getId() {
        return this.stuff.getId();
    }
}
