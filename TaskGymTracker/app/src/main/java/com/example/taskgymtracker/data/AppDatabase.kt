package com.example.taskgymtracker.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Task::class, Workout::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
    abstract fun workoutDao(): WorkoutDao
    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val inst = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "taskgym.db").build()
                INSTANCE = inst
                inst
            }
        }
    }
}
