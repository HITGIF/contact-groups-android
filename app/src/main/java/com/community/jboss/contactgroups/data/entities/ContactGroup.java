package com.community.jboss.contactgroups.data.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by carbonyl on 17-12-19.
 */

@Entity(primaryKeys = {"contactId", "groupId"},
        foreignKeys = {
                @ForeignKey(entity = Contact.class, parentColumns = "uid", childColumns = "contactId"),
                @ForeignKey(entity = Group.class, parentColumns = "uid", childColumns = "groupId"),
        })
public class ContactGroup {

    @NonNull
    private String contactId;
    @NonNull
    private String groupId;

    public ContactGroup(@NonNull String contactId,@NonNull String groupId) {
        this.contactId = contactId;
        this.groupId = groupId;
    }

    @NonNull
    public String getGroupId() {
        return groupId;
    }

    @NonNull
    public String getContactId() {
        return contactId;
    }

    @NonNull
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    @NonNull
    public void setGroupID(String groupId) {
        this.groupId = groupId;
    }
}
