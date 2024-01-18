package com.prolaymm.compository.presentation.screens.coming_soon

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.prolaymm.compository.R

@Composable
fun ComingSoonPage() {

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.coming_soon))

    LottieAnimation(
        modifier = Modifier.fillMaxSize(),
        composition = composition,
        iterations = LottieConstants.IterateForever,
    )
}