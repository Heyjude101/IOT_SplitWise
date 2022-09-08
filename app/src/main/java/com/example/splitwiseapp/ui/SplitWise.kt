package com.example.splitwiseapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.splitwiseapp.ui.screen.*

@Composable
fun SplitWise(){
    Navigation()

}

@Composable
fun Navigation(){

    val navController  =  rememberNavController()
    NavHost(navController = navController , startDestination = "screen0"){
        composable("screen0"){
            screen0(navController = navController)
        }
        composable("screen4"){
            screen4(navController = navController)
        }
        composable("screen3"){
            screen3(navController = navController)
        }
        //@TODO
        composable("screen1"){
            screen1(navController = navController)
        }
        composable("screen2"){
            screen2(navController = navController)
        }
        composable("screen5"){
            screen5(navController = navController)
        }
        composable("screen6"){
            screen6(navController = navController)
        }
        composable("screen6"){
            screen7(navController = navController)
        }

    }

}