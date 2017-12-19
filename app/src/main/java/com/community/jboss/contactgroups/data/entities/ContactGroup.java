package com.community.jboss.contactgroups.data.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

/**
 * Created by carbonyl on 17-12-19.
 */

@Entity(foreignKeys = @ForeignKey(
        entity = Contact.class,
        parentColumns = "uid",
        childColumns = "contactId",
        onDelete = ForeignKey.CASCADE
))
public class ContactGroup {

    private Contact contact;
    private Group group;

    public ContactGroup() {
        this(null, null);
    }

    public ContactGroup(Contact contact, Group group) {
        this.contact = contact;
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public Contact getContact() {
        return contact;
    }
}
