package com.example.plantpal.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EnvironmentScreen(
    onBackClick: () -> Unit
) {
    var remindersEnabled by remember { mutableStateOf(true) }
Column(modifier = Modifier.fillMaxSize().padding(16.dp),
    verticalArrangement = Arrangement.spacedBy(16.dp)){
    Text(
        text = "Environment & Settings",
        style = MaterialTheme.typography.headlineMedium
    )
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Light Sensor",
                style = MaterialTheme.typography.titleLarge)
            Text("Light level: not available")
        }
    }
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Motion Sensor",
                style = MaterialTheme.typography.titleLarge)
            Text("Motion detected: not available")
        }
    }
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Watering reminders",
                modifier = Modifier.weight(1f))
            Switch(checked = remindersEnabled,
                onCheckedChange = {remindersEnabled = it})
        }
    }
    Button(onClick = onBackClick, modifier = Modifier.fillMaxWidth()) {
        Text("Back to dashboard")
    }
}}