package com.prolaymm.compository.presentation.composables

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.prolaymm.compository.ui.theme.PrimaryColor

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String,
    shape: Shape? =null,

    style: TextStyle = TextStyle(),
    buttonColors: ButtonColors? = null,
    content: (@Composable() () -> Unit)? = null,
    onClick: () -> Unit
) {

    Button(
        modifier = modifier,
        shape = shape?:MaterialTheme.shapes.medium,
        contentPadding = PaddingValues(0.dp),
        colors = buttonColors ?: ButtonDefaults.buttonColors(
            containerColor = PrimaryColor
        ),
        onClick = onClick
    ) {
        if(content!= null) content() else  Text(text = text, style = style)
    }
}