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
fun OutputBox(
    inputValue: MutableState<String>,
    outputValue: MutableState<String>,
    oExpanded: MutableState<Boolean>,
    inputUnit: MutableState<String>,
    conversionFactor: MutableState<Double>,
    konversionFactor: KonversionFactor
) {

    // output box
    Box {

        // input button
        Button(onClick = { oExpanded.value = true }) {

            Text(text = "select")

            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "Arrow down"
            )
        }

        OutputDropMenu(
            inputValue,
            outputValue,
            expanded = oExpanded,
            inputUnit = inputUnit,
            conversionFactor,
            konversionFactor
        )
    }
}