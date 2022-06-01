package edu.skku.map.crimenotification.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import edu.skku.map.crimenotification.room.entity.CriminalEntity;

import java.util.List;

@Dao
public interface CriminalDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long registerCriminalEntity(CriminalEntity criminalEntity);

    @Query("SELECT * FROM criminal_table")
    List<CriminalEntity> getAll();

    @Query("SELECT * FROM criminal_table WHERE `name` = (:name) ")
    CriminalEntity getCriminalEntity(String name);
}
