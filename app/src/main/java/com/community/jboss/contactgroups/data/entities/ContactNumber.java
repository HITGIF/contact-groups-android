package com.community.jboss.contactgroups.data.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.UUID;

/**
 * Created by carbonyl on 17-12-19.
 */

@Entity(primaryKeys = {"contactId", "groupId"},
        foreignKeys = {
        @ForeignKey(entity = Contact.class, parentColumns = "uid", childColumns = "contactId"),
        @ForeignKey(entity = Group.class, parentColumns = "uid", childColumns = "groupId"),
})
public class ContactNumber {

    @PrimaryKey
    private final String uid;
    private int number;
    private Contact contact;

    public ContactNumber() {
        this(-1, null);
    }

    public ContactNumber(int number, Contact contact) {
        this(number, contact, UUID.randomUUID().toString());
    }

    private ContactNumber(int number, Contact contact, String uid) {
        this.number = number;
        this.contact = contact;
        this.uid = uid;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getUid() {
        return uid;
    }

}
