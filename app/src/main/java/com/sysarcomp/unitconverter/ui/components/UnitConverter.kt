package com.sysarcomp.unitconverter.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.sysarcomp.unitconverter.ui.utils.ConvertUnit


@Composable
fun UnitConverter(innerPadding: PaddingValues) {

    val inputValue = remember {
        mutableStateOf("")
    }

    val outputValue =
        remember {   // by le hace el tipo de dato puro a la variable , sin el envoltorio de mutableState
            mutableStateOf("")
        }

    val inputUnit = remember {
        mutableStateOf("centimeters")
    }

    var outputUnit by remember {
        mutableStateOf("meters")
    }

    val iExpanded = remember {
        mutableStateOf(false)
    }

    val oExpanded = remember {
        mutableStateOf(false)
    }

    val conversionFactor = remember {
        mutableStateOf(0.01)
    }

    val oConversionFactor = remember {
        mutableStateOf(0.01)
    }


    // pintamos la pantalla
    BaseContainer(inputValue, outputValue, iExpanded, oExpanded, inputUnit, conversionFactor)
}