package com.community.jboss.contactgroups.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.community.jboss.contactgroups.data.daos.ContactDao;
import com.community.jboss.contactgroups.data.daos.ContactGroupDao;
import com.community.jboss.contactgroups.data.daos.ContactNumberDao;
import com.community.jboss.contactgroups.data.daos.GroupDao;
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

    public abstract ContactDao getContactDao();

    public abstract ContactNumberDao getContactNumberDao();

    public abstract GroupDao getGroupDao();

    public abstract ContactGroupDao getContactGroupDao();
}
