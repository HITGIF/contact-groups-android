package com.community.jboss.contactgroups.data.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

/**
 * Created by carbonyl on 17-12-19.
 */

@Entity
public class Group {

    @PrimaryKey @NonNull
    private String uid;
    private String name;

    public Group(String name) {
        this(name, UUID.randomUUID().toString());
    }

    private Group(String name, @NonNull String uid) {
        this.name = name;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getUid() {
        return uid;
    }

    public void setUid(@NonNull String uid) {
        this.uid = uid;
    }
}
