package com.example.taskgymtracker.repo

import com.example.taskgymtracker.data.AppDatabase
import com.example.taskgymtracker.data.Task
import com.example.taskgymtracker.data.Workout
import kotlinx.coroutines.flow.Flow

class AppRepository(private val db: AppDatabase) {
    val tasks: Flow<List<Task>> = db.taskDao().allTasks()
    val workouts: Flow<List<Workout>> = db.workoutDao().allWorkouts()
    suspend fun addTask(title: String, details: String) = db.taskDao().insert(Task(title = title, details = details))
    suspend fun updateTask(t: Task) = db.taskDao().update(t)
    suspend fun deleteTask(t: Task) = db.taskDao().delete(t)
    suspend fun addWorkout(name: String, notes: String) = db.workoutDao().insert(Workout(name = name, notes = notes))
    suspend fun deleteWorkout(w: Workout) = db.workoutDao().delete(w)
}
