package com.sysarcomp.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sysarcomp.unitconverter.ui.components.UnitConverter
import com.sysarcomp.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            UnitConverterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    UnitConverter(innerPadding)

                }
            }

        }
    }
}




@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverterTheme {

        UnitConverter(innerPadding = PaddingValues())

    }
}