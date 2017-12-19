package com.community.jboss.contactgroups.data.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

/**
 * Created by carbonyl on 17-12-19.
 */

@Entity(foreignKeys = @ForeignKey(
        entity = Contact.class,
        parentColumns = "uid",
        childColumns = "contactID",
        onDelete = ForeignKey.CASCADE
))
public class ContactNumber {

    @PrimaryKey
    @NonNull
    private String uid;
    @NonNull
    private String number;
    @NonNull
    private String contactID;

    @Ignore
    public ContactNumber(String number, String contactID) {
        this(number, contactID, UUID.randomUUID().toString());
    }

    public ContactNumber(@NonNull String number,@NonNull String contactID,@NonNull String uid) {
        this.number = number;
        this.contactID = contactID;
        this.uid = uid;
    }

    @NonNull
    public String getNumber() {
        return number;
    }

    public void setNumber(@NonNull String number) {
        this.number = number;
    }

    @NonNull
    public String getContactID() {
        return contactID;
    }

    @NonNull
    public String getUid() {
        return uid;
    }

    public void setUid(@NonNull String uid) {
        this.uid = uid;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
    }
}
