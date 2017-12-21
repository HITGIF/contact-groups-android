package com.community.jboss.contactgroups.data.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.community.jboss.contactgroups.data.entities.Contact;
import com.community.jboss.contactgroups.data.entities.ContactGroup;
import com.community.jboss.contactgroups.data.entities.Group;

import java.util.List;

/**
 * Created by carbonyl on 17-12-19.
 */

@Dao
public interface ContactGroupDao {

    @Insert
    void insert(ContactGroup contactGroup);

    @Query("SELECT * FROM contact INNER JOIN contactgroup ON contact.uid = contactgroup.contactId WHERE contactgroup.groupId = :groupId")
    List<Contact> getContactList(String groupId);

    @Query("SELECT * FROM `group` INNER JOIN contactgroup ON `group`.uid = contactgroup.groupId WHERE contactgroup.contactId = :contactId")
    List<Group> getGroupList(String contactId);
}
