package com.example.taskgymtracker.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks ORDER BY createdAt DESC")
    fun allTasks(): Flow<List<Task>>
    @Insert suspend fun insert(task: Task): Long
    @Update suspend fun update(task: Task)
    @Delete suspend fun delete(task: Task)
}

@Dao
interface WorkoutDao {
    @Query("SELECT * FROM workouts ORDER BY createdAt DESC")
    fun allWorkouts(): Flow<List<Workout>>
    @Insert suspend fun insert(w: Workout): Long
    @Update suspend fun update(w: Workout)
    @Delete suspend fun delete(w: Workout)
}
