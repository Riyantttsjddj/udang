package com.example.shrimpcounterapp.database;

import androidx.room.*;
import java.util.List;

@Dao
public interface DetectionDao {
    @Query("SELECT * FROM Detection")
    List<Detection> getAll();

    @Insert
    void insert(Detection detection);
}