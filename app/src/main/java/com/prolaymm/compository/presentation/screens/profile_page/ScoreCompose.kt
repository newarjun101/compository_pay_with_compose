package com.prolaymm.compository.presentation.screens.profile_page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.prolaymm.compository.presentation.composables.AnimationProgressBar
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.PrimaryColor

@Composable
fun ScoreCompose(title : String, value : String,modifier: Modifier=Modifier) {

    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Text(value, style = MaterialTheme.typography.headlineMedium.copy(color= PrimaryColor))
        Text(title, style = MaterialTheme.typography.bodySmall.copy(color= HintColor))


    }
}