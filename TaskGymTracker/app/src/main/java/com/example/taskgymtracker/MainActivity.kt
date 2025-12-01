package com.example.taskgymtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = AppDatabase.getInstance(applicationContext)
        val repo = AppRepository(db)
        val vm = MainViewModel(repo)
        setContent { AppEntry(vm) }
    }
}

@Composable
fun AppEntry(vm: MainViewModel) {
    MaterialTheme { Text("Task & Gym Tracker — open the project in Android Studio") }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() { MaterialTheme { Text("Preview") } }
