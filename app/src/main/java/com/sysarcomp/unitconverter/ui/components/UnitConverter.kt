package com.sysarcomp.unitconverter.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.sysarcomp.unitconverter.ui.utils.KonversionFactor


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
        mutableStateOf("")
    }

    val outputUnit = remember {
        mutableStateOf("")
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

    var konversionFactor = KonversionFactor(0.0, 0.0)

    // pintamos la pantalla
    BaseContainer(
        inputValue,
        outputValue,
        iExpanded,
        oExpanded,
        inputUnit,
        outputUnit,
        conversionFactor,
        oConversionFactor,
        konversionFactor
    )
}