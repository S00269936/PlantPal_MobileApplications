package com.example.plantpal.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PlantDetailsScreen(
    onBackClick: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Plant Details",
            style = MaterialTheme.typography.headlineMedium)

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "fill details here",
                    style = MaterialTheme.typography.titleLarge
                )
                Text("x")
                Text("y")
                Text("z")
            }
        }
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Edit plant")
        }
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Delete Plant")
        }
        Button(
            onClick = onBackClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Back to My Plants")
        }
    }
}