package com.example.taskgymtracker.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taskgymtracker.repo.AppRepository
import com.example.taskgymtracker.data.Task
import com.example.taskgymtracker.data.Workout
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class MainViewModel(private val repo: AppRepository) : ViewModel() {
    val tasksFlow: Flow<List<Task>> = repo.tasks
    val workoutsFlow: Flow<List<Workout>> = repo.workouts
    fun addTask(title: String, details: String) = viewModelScope.launch(Dispatchers.IO) { repo.addTask(title, details) }
    fun toggleTaskDone(task: Task) = viewModelScope.launch(Dispatchers.IO) { repo.updateTask(task.copy(isDone = !task.isDone)) }
    fun deleteTask(task: Task) = viewModelScope.launch(Dispatchers.IO) { repo.deleteTask(task) }
    fun addWorkout(name: String, notes: String) = viewModelScope.launch(Dispatchers.IO) { repo.addWorkout(name, notes) }
    fun deleteWorkout(workout: Workout) = viewModelScope.launch(Dispatchers.IO) { repo.deleteWorkout(workout) }
}
