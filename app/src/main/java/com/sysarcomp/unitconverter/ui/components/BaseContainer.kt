package com.sysarcomp.unitconverter.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BaseContainer(
    inputValue: MutableState<String>,
    outputValue: MutableState<String>,
    iExpanded: MutableState<Boolean>,
    oExpanded: MutableState<Boolean>,
    inputUnit: MutableState<String>,
    conversionFactor: MutableState<Double>
) {


    Column(
        // estos argumentos le dan estilo visual a los componentes,en la pantalla
        modifier = Modifier
            .padding(40.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text = "Unit converter")

        // espacio entre los componentes
        Spacer(modifier = Modifier.height(16.dp))

        InputField(inputValue = inputValue)

        Spacer(modifier = Modifier.height(16.dp))

        Row {

            InputBox(inputValue, outputValue, iExpanded = iExpanded, inputUnit, conversionFactor)

            Spacer(modifier = Modifier.width(16.dp))

            OutputBox(inputValue,outputValue, oExpanded = oExpanded, inputUnit, conversionFactor)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("result")

    }
}