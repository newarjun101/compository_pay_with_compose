package com.prolaymm.compository.presentation.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.prolaymm.compository.ui.theme.PrimaryColor

@Composable
fun CustomButton(
    text: String,

    modifier: Modifier = Modifier,
    style: TextStyle = TextStyle(),
    buttonColors: ButtonColors? = null,
    onClick: () -> Unit
) {

    Button(
        modifier = modifier,
        contentPadding = PaddingValues(0.dp),
        colors = buttonColors ?: ButtonDefaults.buttonColors(
            containerColor = PrimaryColor
        ),
        onClick = onClick
    ) {
        Text(text = text, style = style)
    }
}