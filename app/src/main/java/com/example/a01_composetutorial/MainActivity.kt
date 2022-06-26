package com.example.a01_composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text

/* The setContent block defines the activity's layout where composable functions are called.
Composable functions can only be called from other composable functions.
    Jetpack Compose uses a Kotlin compiler plugin to transform these composable functions into
the app's UI elements. For example, the Text composable function that is defined by the Compose UI
library displays a text label on the screen.
*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Hello World!")
        }
    }
}

