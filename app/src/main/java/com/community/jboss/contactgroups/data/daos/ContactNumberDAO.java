package com.community.jboss.contactgroups.data.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.community.jboss.contactgroups.data.entities.ContactNumber;

import java.util.List;

/**
 * Created by carbonyl on 17-12-19.
 */

@Dao
public interface ContactNumberDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(ContactNumber contactNumber);

    @Update
    void update(ContactNumber contactNumber);

    @Query("SELECT * FROM contactnumber WHERE number = :number")
    ContactNumber getContactNumber(String number);

    @Query("SELECT * FROM contactnumber WHERE contactID = :contactID")
    List<ContactNumber> getContactNumberList(String contactID);
}
