package com.sysarcomp.unitconverter.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.sysarcomp.unitconverter.ui.utils.KonversionFactor


@Composable
fun InputBox(
    inputValue: MutableState<String>,
    outputValue: MutableState<String>,
    iExpanded: MutableState<Boolean>,
    inputUnit: MutableState<String>,
    conversionFactor: MutableState<Double>,
    konversionFactor: KonversionFactor
) {

    // input box
    Box {

        // input button
        Button(onClick = { iExpanded.value = true }) {

            Text(text = "select")

            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "Arrow down"
            )

            DropMenu(
                inputValue,
                outputValue,
                expanded = iExpanded,
                inputUnit,
                conversionFactor,
                konversionFactor
            )
        }
    }
}