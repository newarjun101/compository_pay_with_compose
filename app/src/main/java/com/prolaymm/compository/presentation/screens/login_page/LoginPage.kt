package com.prolaymm.compository.presentation.screens.login_page

import android.annotation.SuppressLint
import android.graphics.fonts.FontStyle
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.TextField
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.prolaymm.compository.R
import com.prolaymm.compository.presentation.composables.CustomButton
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.presentation.routes.rLogin
import com.prolaymm.compository.presentation.routes.rMainPage
import com.prolaymm.compository.presentation.routes.rWelcome
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.OnPrimaryColor
import com.prolaymm.compository.ui.theme.PrimaryColor
import com.prolaymm.compository.ui.theme.TransparentColor
import com.prolaymm.compository.utils.kDefaultFontSize
import com.prolaymm.compository.utils.kDefaultMarginHeight
import com.prolaymm.compository.utils.kDefaultMarginWidth
import java.util.Stack

@SuppressLint("ShowToast")
@Composable
fun LoginPage(navController: NavController) {
   val context =  LocalContext.current
    var inputText by remember {
        mutableStateOf("")
    }
    var isInputFocus by remember {
        mutableStateOf(false)
    }
    Box(
        // contentAlignment = Alignment.TopCenter,
        Modifier
            .paint(
                alignment = Alignment.TopCenter,
                painter = painterResource(id = R.drawable.login_canvas),
            )


    ) {

        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = kDefaultMarginWidth, vertical = kDefaultMarginHeight)

        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(shape = MaterialTheme.shapes.extraLarge)
                    .background(
                        color = if (!isInputFocus)
                            HintColor.copy(alpha = 0.3f)
                        else OnPrimaryColor
                    )
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth()
            ) {

                Text(
                    text = "+95",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color =   if (!isInputFocus)
                            HintColor
                        else PrimaryColor,
                        textAlign = TextAlign.Start,
                    ),
                )
                TextField(value = inputText,
                    shape = MaterialTheme.shapes.extraLarge,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Phone
                    ),
                    modifier = Modifier
                        .height(48.dp)
                        .padding(0.dp)
                        .onFocusChanged {
                            isInputFocus = it.isFocused
                        },
                    maxLines = 1,
                    placeholder = {
                        Text(
                            "Mobile number",
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = HintColor
                            )
                        )
                    },
                    //    suffix = { Text (inputText, style =TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor), modifier = Modifier.padding(bottom = 5.dp),textAlign = TextAlign.Start) },
                    textStyle = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryColor,
                        textAlign = TextAlign.Start,
                    ),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = TransparentColor,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = TransparentColor,
                        unfocusedContainerColor = Color.Transparent
                    ),
                    onValueChange = {

                        inputText = it
                    })
            } /// Row
            SizedBox(height = 20.dp)
            CustomButton(
                text = "Verify", modifier = Modifier
                    .fillMaxWidth()

            ) {
                if(inputText.length<6) {
                    Toast.makeText(context,"Please fill correctly",Toast.LENGTH_SHORT).show()
                } else {
                    navController.navigate(rMainPage){
                        popUpTo(rLogin) {
                            inclusive = true
                        }
                    }
                }
            } ///custom button
            Text(
                text = "Your personal details are safe with us\n Read our Privacy Policy and Terms and Conditions ",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .padding(
                        top = 8.dp,
                        bottom = 4.dp,
                        start = kDefaultMarginWidth * 2,
                        end = kDefaultMarginWidth * 2
                    ),
                textAlign = TextAlign.Center
            )
        }

    }
}