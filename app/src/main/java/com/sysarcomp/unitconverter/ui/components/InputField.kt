package com.sysarcomp.unitconverter.ui.components

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

@Composable
fun InputField(inputValue: MutableState<String>) {

    OutlinedTextField(

        value = inputValue.value,

        onValueChange = { inputValue.value = it },

        label = { Text(text = "enter value") },

        singleLine = true
    )
}