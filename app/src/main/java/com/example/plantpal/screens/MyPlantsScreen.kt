package com.example.plantpal.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyPlantsScreen(
    onBackClick: () -> Unit,
    onPlantClick: () -> Unit
){
    val plants = listOf(
        "Irish lily",
        "Audrey",
        "idk put more plants here"
    )
    Column(modifier = Modifier.fillMaxSize()
        .padding(16.dp)) {
        Text(text = "My Plants",
            style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.weight(1f)
        ) {
            items(plants) {plant -> Card(
                onClick = onPlantClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = plant,
                    modifier = Modifier.padding(16.dp))
            }}
        }
        Button(
            onClick = onBackClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Back to the dashboard")
        }
    }
}