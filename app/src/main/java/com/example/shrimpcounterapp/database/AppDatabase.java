package com.example.shrimpcounterapp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Detection.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DetectionDao detectionDao();
}