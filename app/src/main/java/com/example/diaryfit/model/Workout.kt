package com.example.diaryfit.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workouts")
data class Workout(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val date: String,
    val dayOfWeek: String,
    val name: String? = null,
    val notes: String? = null,
    val duration: Int? = null,
    val createdAt: Long = System.currentTimeMillis()
)