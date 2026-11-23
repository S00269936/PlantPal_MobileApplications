package com.example.plantpal.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen(
    onMyPlantsClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Welcome to PlantPal",
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = "Manage your plants and watering schedules."
        )
        Card(
            modifier = Modifier.fillMaxWidth()
        )
        {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "My Plant Collection",
                    style = MaterialTheme.typography.titleLarge
                )
                Text("Saved plants will appear here.")
            }
        }
        Button(
            onClick = onMyPlantsClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("My plants")
        }
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Care Schedule")
        }
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) { Text("Environment & Settings") }
    }
}