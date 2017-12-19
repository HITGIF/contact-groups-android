package com.community.jboss.contactgroups.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.community.jboss.contactgroups.data.daos.ContactDAO;
import com.community.jboss.contactgroups.data.daos.ContactGroupDAO;
import com.community.jboss.contactgroups.data.daos.ContactNumberDAO;
import com.community.jboss.contactgroups.data.daos.GroupDAO;
import com.community.jboss.contactgroups.data.entities.Contact;
import com.community.jboss.contactgroups.data.entities.ContactGroup;
import com.community.jboss.contactgroups.data.entities.ContactNumber;
import com.community.jboss.contactgroups.data.entities.Group;

/**
 * Created by carbonyl on 17-12-19.
 */

@Database(entities = {
        Contact.class,
        ContactNumber.class,
        Group.class,
        ContactGroup.class
}, version = 1)
public abstract class ContactDB extends RoomDatabase {

    public abstract ContactDAO getContactDAO();

    public abstract ContactNumberDAO getContactNumberDAO();

    public abstract GroupDAO getGroupDAO();

    public abstract ContactGroupDAO getContactGroupDAO();
}
