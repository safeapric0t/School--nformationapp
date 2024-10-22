package com.example.schoolinfoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.schoolinfoapp.ui.theme.SchoolInfoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SchoolInfoAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SchoolInfoApp()
                }
            }
        }
    }
}

@Composable
fun SchoolInfoApp() {
    var announcements by remember { mutableStateOf(sampleAnnouncements) }

    Column {
        Header()
        Row(modifier = Modifier.weight(1f)) {
            AnnouncementList(
                announcements = announcements,
                modifier = Modifier.weight(2f)
            )
            AdminPanel(
                onAddAnnouncement = { newAnnouncement ->
                    announcements = listOf(newAnnouncement) + announcements
                },
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SchoolInfoAppTheme {
        SchoolInfoApp()
    }
}

val sampleAnnouncements = listOf(
    Announcement(1, "Welcome Back!", "We hope you had a great summer break. Classes start next Monday.", "2023-09-01"),
    Announcement(2, "New Library Hours", "The library will now be open until 9 PM on weekdays.", "2023-09-03")
)