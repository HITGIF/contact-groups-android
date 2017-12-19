package com.community.jboss.contactgroups.data.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by carbonyl on 17-12-19.
 */

@Entity(primaryKeys = {"contactID", "groupID"},
        foreignKeys = {
                @ForeignKey(entity = Contact.class, parentColumns = "uid", childColumns = "contactID"),
                @ForeignKey(entity = Group.class, parentColumns = "uid", childColumns = "groupID"),
        })
public class ContactGroup {

    @NonNull
    private String contactID;
    @NonNull
    private String groupID;

    public ContactGroup(@NonNull String contactID,@NonNull String groupID) {
        this.contactID = contactID;
        this.groupID = groupID;
    }

    @NonNull
    public String getGroupID() {
        return groupID;
    }

    @NonNull
    public String getContactID() {
        return contactID;
    }

    @NonNull
    public void setContactID(String contactID) {
        this.contactID = contactID;
    }

    @NonNull
    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }
}
