package com.labela.labelamagotchi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.labela.labelamagotchi.home.HomeScreen
import com.labela.labelamagotchi.ui.theme.LabelamagotchiTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LabelamagotchiTheme { HomeScreen() }
        }
    }
}