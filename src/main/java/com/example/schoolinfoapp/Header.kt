package com.example.schoolinfoapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Header() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.primary
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "School Info App",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onPrimary
            )
            Row {
                TextButton(onClick = { /* TODO */ }) {
                    Text("Home", color = MaterialTheme.colorScheme.onPrimary)
                }
                TextButton(onClick = { /* TODO */ }) {
                    Text("About", color = MaterialTheme.colorScheme.onPrimary)
                }
                TextButton(onClick = { /* TODO */ }) {
                    Text("Contact", color = MaterialTheme.colorScheme.onPrimary)
                }
            }
        }
    }
}