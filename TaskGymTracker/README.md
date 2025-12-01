# TaskGymTracker (pre-split starter)

This is a pre-split Android Studio project skeleton created automatically. It contains:
- Kotlin + Jetpack Compose friendly Gradle config
- Room entities, DAOs, DB
- Repository + ViewModel skeletons
- Simple drawable icon & splash background
- A WorkManager skeleton for daily reminders (ReminderWorker)

How to open:
1. Download the ZIP from the link provided by the assistant message.
2. In Android Studio: File → Open... → select the extracted folder `TaskGymTracker`.
3. Let Gradle sync and then run on a device/emulator.

What's *not* included:
- Complete Compose UI screens (you can use the canvas code I created earlier; I kept this scaffold minimal to keep file sizes practical).
- Notification channel creation (you'll need to add channel setup before Android 8+ notifications will appear).
- Production-grade signing configs and ProGuard rules.

Next steps I can do for you (choose any or I will proceed automatically):
- Add full Compose UI split across files (Tasks, Workouts, detailed Workout with sets/reps/timers).
- Implement notification channel and schedule a daily WorkManager job for reminders.
- Add a simple animation for opening screens and a splash transition.
- Produce a signed release APK (you will need to provide keystore or allow me to create a debug-signed build).

