package com.example.plantpal.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CareScheduleScreen(
    onBackClick: () -> Unit
) {
    var watered by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Care Schedule",
            style = MaterialTheme.typography.headlineMedium
        )
        Text("Upcoming watering tasks")
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Monstera",
                    style = MaterialTheme.typography.titleLarge
                )
                if (watered) {
                    Text("Watering completed")
                }else {
                    Text("Watering due today")
                }
                Button(
                    onClick = { watered = true },
                    enabled = !watered
                ) {
                    Text("Mark as Watered")
                }
            }
        }
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Peace Lily",
                    style = MaterialTheme.typography.titleLarge
                )

                Text("Watering due tomorrow")
            }
        }
        Button(
            onClick = onBackClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Back to Dashboard")
        }
    }
}