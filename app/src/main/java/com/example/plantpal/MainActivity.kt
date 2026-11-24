package com.example.plantpal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.plantpal.screens.DashboardScreen
import com.example.plantpal.screens.MyPlantsScreen
import com.example.plantpal.ui.theme.PlantPalTheme
import com.example.plantpal.screens.PlantDetailsScreen
import com.example.plantpal.screens.PlantFormScreen
import com.example.plantpal.screens.CareScheduleScreen
import com.example.plantpal.screens.EnvironmentScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PlantPalTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "dashboard",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("dashboard") {
                            DashboardScreen(
                                onMyPlantsClick = {
                                    navController.navigate("myplants")
                                },
                                onScheduleClick = {
                                    navController.navigate("careschedule")
                                },
                                onEnvironmentClick = {
                                    navController.navigate("environment")
                                }
                            )
                        }
                        composable("myplants") {
                            MyPlantsScreen(
                                onBackClick = {
                                    navController.popBackStack()
                                },
                                onPlantClick = {
                                    navController.navigate("plantdetails")
                                },
                                onAddPlantClick = {
                                    navController.navigate("plantform")
                                }
                            )
                        }
                        composable("plantdetails") {
                            PlantDetailsScreen(
                                onBackClick = {
                                    navController.popBackStack()
                                }
                            )
                        }
                        composable("plantform") {
                            PlantFormScreen(
                                onBackClick = {
                                    navController.popBackStack()
                                }
                            )
                        }
                        composable("careschedule") {
                            CareScheduleScreen(
                                onBackClick = {
                                    navController.popBackStack()
                                }
                            )
                        }
                        composable("environment") {
                            EnvironmentScreen(
                                onBackClick = {
                                    navController.popBackStack()
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}