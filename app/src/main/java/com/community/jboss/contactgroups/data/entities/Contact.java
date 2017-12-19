package com.community.jboss.contactgroups.data.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.UUID;

/**
 * Created by carbonyl on 17-12-19.
 */

@Entity
public class Contact {

    @PrimaryKey
    private final String uid;
    private String name;

    public Contact() {
        this(null);
    }

    public Contact(String name) {
        this(name, UUID.randomUUID().toString());
    }

    private Contact(String name, String uid) {
        this.name = name;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }
}