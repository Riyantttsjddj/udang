package com.example.shrimpcounterapp.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Detection {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String result;
    public long timestamp;
}