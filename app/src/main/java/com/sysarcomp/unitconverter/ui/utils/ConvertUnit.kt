package com.sysarcomp.unitconverter.ui.utils

import androidx.compose.runtime.MutableState
import kotlin.math.roundToInt

fun ConvertUnit(
    inputValue: MutableState<String>,
    outputValue: MutableState<String>,
    conversionFactor: MutableState<Double>,
    oConversionFactor: MutableState<Double>
) {

    val inputValueDouble =
        inputValue.value.toDoubleOrNull() ?: 0.0 // si retorna null , se setea a 0.0

    // formateamos el resultado
    val result = (((inputValueDouble * conversionFactor.value) * 100).roundToInt()) / 100

    outputValue.value = result.toString()

}