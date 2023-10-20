package com.nfs;

import com.nfs.entity.Planning;
import com.nfs.entity.Stuff;
import com.nfs.entity.StuffCoaching;
import com.nfs.valueobject.*;

public final class Main {
    public static void main(String[] args) {
        final Planning planning = new Planning("Planning test");
        System.out.printf(ReferenceCoaching.NEXT_ID + "\n");
        System.out.printf(Reference.NEXT_ID + "\n");

        final StuffCoaching stuff = new StuffCoaching("Stuff test", new Size(10));
        System.out.printf(ReferenceCoaching.NEXT_ID + "\n");
        System.out.printf(Reference.NEXT_ID + "\n");
        System.out.printf(stuff.getId() + "\n");

    }
}