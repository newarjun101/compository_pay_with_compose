package com.prolaymm.compository.presentation.composables

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.OnPrimaryColor
import com.prolaymm.compository.ui.theme.PrimaryColor
import com.prolaymm.compository.ui.theme.TransparentColor


@Composable
fun CustomSearchField(inputText : String,modifier : Modifier = Modifier,hintText : String,readOnly :Boolean = false ,onChange : ()-> Unit = {} ) {
    TextField(value = inputText,
        shape = MaterialTheme.shapes.extraLarge,
        readOnly = readOnly,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Phone
        ),
        modifier = modifier
            .padding(0.dp),
        maxLines = 1,
        placeholder = {
            Text(
                hintText,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = HintColor
                )
            )
        },
         suffix = { Icon(Icons.Outlined.Search,contentDescription ="", tint = HintColor,modifier=Modifier.size(24.dp).padding(bottom = 6.dp)) },
        textStyle = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = PrimaryColor,
            textAlign = TextAlign.Start,
        ),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = HintColor.copy(alpha = 0.3f),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = TransparentColor,
            unfocusedContainerColor = HintColor.copy(alpha = 0.3f)
        ),
        onValueChange = {

        })

}