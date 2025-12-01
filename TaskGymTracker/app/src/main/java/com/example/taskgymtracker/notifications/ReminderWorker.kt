package com.example.taskgymtracker.notifications

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class ReminderWorker(appContext: Context, params: WorkerParameters) : CoroutineWorker(appContext, params) {
    override suspend fun doWork(): Result {
        val nm = NotificationManagerCompat.from(applicationContext)
        val notification = NotificationCompat.Builder(applicationContext, "default")
            .setContentTitle("Workout reminder")
            .setContentText("Don't forget your workout today!")
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .build()
        nm.notify(1001, notification)
        return Result.success()
    }
}
