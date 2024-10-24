package com.sysarcomp.unitconverter.ui.components

import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.sysarcomp.unitconverter.ui.utils.ConvertUnit
import com.sysarcomp.unitconverter.ui.utils.KonversionFactor

@Composable
fun OutputDropMenu(
    inputValue: MutableState<String>,
    outputValue: MutableState<String>,
    expanded: MutableState<Boolean>,
    inputUnit: MutableState<String>,
    conversionFactor: MutableState<Double>,
    konversionFactor: KonversionFactor
) {


    DropdownMenu(expanded = expanded.value, onDismissRequest = { expanded.value = false }) {

        DropdownMenuItem(
            text = { Text(text = "centimeters") },
            onClick = {

                // cuando se clickea el item , se oculta el drop menu
                // y se setea la variable inputUnit

                expanded.value = false

                inputUnit.value = "centimeters"

                conversionFactor.value = 0.01

                konversionFactor.outputFactor = 0.01

                //formatea el input ingresado por el usuario
                // y lo muestra en el output
                ConvertUnit(inputValue, outputValue = outputValue, konversionFactor)
            })

        DropdownMenuItem(
            text = { Text(text = "meters") },
            onClick = {

                expanded.value = false

                inputUnit.value = "meters"

                conversionFactor.value = 1.0

                konversionFactor.outputFactor = 1.0

                ConvertUnit(inputValue, outputValue = outputValue, konversionFactor)
            })

        DropdownMenuItem(
            text = { Text(text = "feet") },
            onClick = {
                expanded.value = false

                inputUnit.value = "feet"

                conversionFactor.value = 0.3048

                konversionFactor.outputFactor = 0.3048

                ConvertUnit(inputValue, outputValue = outputValue, konversionFactor)
            })

        DropdownMenuItem(
            text = { Text(text = "millimeters") },
            onClick = {
                expanded.value = false

                inputUnit.value = "millimeters"

                conversionFactor.value = 0.001

                konversionFactor.outputFactor = 0.001

                ConvertUnit(inputValue, outputValue = outputValue, konversionFactor)
            })

    }
}