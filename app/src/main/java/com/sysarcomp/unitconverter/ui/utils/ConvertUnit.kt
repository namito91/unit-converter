package com.sysarcomp.unitconverter.ui.utils

import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.MutableState
import kotlin.math.roundToInt

fun ConvertUnit(
    inputValue: MutableState<String>,
    outputValue: MutableState<String>,
    konversionFactor: KonversionFactor,

    ) {

    val factorI = konversionFactor.inputFactor
    val factorO = konversionFactor.outputFactor


    Log.i("patrox", "factor i : ${factorI.toString()}")
    Log.i("patrox", "factor o : ${factorO.toString()}")

    val inputValueDouble =
        inputValue.value.toDoubleOrNull() ?: 0.0 // si retorna null , se setea a 0.0

    if (!(factorI.isNaN()) && !(factorO.isNaN()) && inputValueDouble != 0.0) {

        // formateamos el resultado
        val result = ((((inputValueDouble * factorI) * 100) / factorO).roundToInt()) / 100

        outputValue.value = result.toString()

        Log.i("patrox", result.toString())
    }


}