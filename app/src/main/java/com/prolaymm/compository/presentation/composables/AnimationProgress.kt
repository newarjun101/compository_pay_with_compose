package com.prolaymm.compository.presentation.composables

import android.widget.Toast
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.EaseOutElastic
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.prolaymm.compository.R
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.OnPrimaryColor
import com.prolaymm.compository.ui.theme.PrimaryColor


@Composable
fun AnimationProgressBar(modifier: Modifier) {
    var currentProgress by remember { mutableFloatStateOf(0f) }
    val context = LocalContext.current

    val currentPercentage by animateFloatAsState(
        targetValue = currentProgress,
        animationSpec = tween(durationMillis = 2000, easing = LinearOutSlowInEasing),
        label = ""
    )

    LaunchedEffect(key1 = Unit) {
        currentProgress = 0.85f
    }
    val size by animateFloatAsState(
        targetValue = currentProgress,
        tween(
            durationMillis = 1000,
            delayMillis = 200,
            easing = LinearOutSlowInEasing
        ), label = ""
    )

    Column(modifier = modifier) {

        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(0.8f)) {
                Row(
                    modifier = Modifier
                        .widthIn(min = 30.dp)
                        .fillMaxWidth(if (size < 0.2) size else size - 0.068f).padding(bottom = 4.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(text = "${(currentProgress * 100).toInt()}%")

                }
                LinearProgressIndicator(
                    strokeCap = StrokeCap.Round,
                    modifier = Modifier
                        .height(8.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = OnPrimaryColor),
                    progress = currentPercentage,
                    color = PrimaryColor
                )
            }
            SizedBox(width = 6.dp)

            Text("Lv 4", style = MaterialTheme.typography.bodyMedium.copy(color = HintColor))

        }
    }


}


/*
@Composable
fun CustomProgressBar() {

    val context = LocalContext.current
    var progress by remember { mutableStateOf(0f) }

    LaunchedEffect(key1 = Unit) {
        progress = 0.85f
    }

    val size by animateFloatAsState(
        targetValue = progress,
        tween(
            durationMillis = 1000,
            delayMillis = 200,
            easing = LinearOutSlowInEasing
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp, start = 30.dp, end = 30.dp)
    ) {
        // for the text above the progressBar
        Row(
            modifier = Modifier
                .widthIn(min = 30.dp)
                .fillMaxWidth(size),
            horizontalArrangement = Arrangement.End
        ) {
            Text(text = "$progress")
        }
        // Progress Bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(17.dp)
        ) {
            // for the background of the ProgressBar
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(9.dp))
                    .background(Color.Yellow)
            )
            // for the progress of the ProgressBar
            Box(
                modifier = Modifier
                    .fillMaxWidth(size)
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(9.dp))
                    .background(Color.Blue)
                    .animateContentSize()
            )
        }


    }

//    Use this when you want your progress bar should animate when you open your app
//    LaunchedEffect(key1 = true) {
//        progressCount = 7
//    }

}*/
