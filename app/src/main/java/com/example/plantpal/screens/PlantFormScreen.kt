package com.example.plantpal.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PlantFormScreen(
    onBackClick: () -> Unit
){
    var name by remember { mutableStateOf("") }
    var species by remember { mutableStateOf("") }
    var location by remember { mutableStateOf("") }
    var wateringInterval by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Add Plant",
            style = MaterialTheme.typography.headlineMedium
        )
        OutlinedTextField(
            value = name, onValueChange = {name = it},
            label = {Text("Plant Name")}, modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = species, onValueChange = {species = it},
            label = {Text("Species")}, modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = location, onValueChange = {location = it},
            label = {Text("Location")}, modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = wateringInterval, onValueChange = {wateringInterval = it},
            label = {Text("Watering Interval (Days)")}, modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = onBackClick,
            enabled = name.isNotBlank() &&
            species.isNotBlank() &&
            location.isNotBlank() &&
                    (wateringInterval.toIntOrNull() ?:0)>0,
        modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save Plant")
    }
        Button(
            onClick = onBackClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Cancel")
        }
    }
}