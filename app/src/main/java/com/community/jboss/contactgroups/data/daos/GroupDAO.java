package com.community.jboss.contactgroups.data.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.community.jboss.contactgroups.data.entities.Group;

import java.util.List;

/**
 * Created by carbonyl on 17-12-19.
 */

@Dao
public interface GroupDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Group group);

    @Query("SELECT * FROM `group`")
    List<Group> getGroupList();
}