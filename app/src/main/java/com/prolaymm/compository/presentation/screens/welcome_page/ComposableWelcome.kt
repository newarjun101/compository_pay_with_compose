package com.prolaymm.compository.presentation.screens.welcome_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.prolaymm.compository.R
import com.prolaymm.compository.presentation.composables.CustomButton
import com.prolaymm.compository.presentation.ui_vos.WelcomeVo
import com.prolaymm.compository.utils.kDefaultMarginWidth

@Composable
fun ComposableWelcome(
     welcomeVo: WelcomeVo,
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.padding(0.dp)
    ) {
        Image(
            painter = painterResource(id = welcomeVo.image),
            contentDescription = "",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        )
        Text(
            text = welcomeVo.title,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(
                top = 8.dp,
                bottom = 4.dp,
                start = kDefaultMarginWidth,
                end = kDefaultMarginWidth
            )
        )
        Text(
            text = welcomeVo.subtitle,
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

