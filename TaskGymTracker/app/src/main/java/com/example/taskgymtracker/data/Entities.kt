package com.example.taskgymtracker.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val details: String = "",
    val isDone: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)

@Entity(tableName = "workouts")
data class Workout(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val notes: String = "",
    val createdAt: Long = System.currentTimeMillis()
)
