package com.prolaymm.compository.presentation.composables

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.progressSemantics
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import coil.decode.GifDecoder
import coil.request.ImageRequest
import com.prolaymm.compository.ui.theme.HintColor



    @Composable
    fun CustomNetworkImage(imageUrl : String,modifier: Modifier) {
        SubcomposeAsyncImage(
            ImageRequest.Builder(LocalContext.current)
                .data(imageUrl)
                .decoderFactory(GifDecoder.Factory())
                .build(),

            contentDescription = "Translated description of what the image contains",
            contentScale = ContentScale.Crop,
            error = {
                Icon(Icons.Rounded.Warning,"", tint = HintColor)
            },
            loading = {
                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    CircularProgressIndicator(modifier = Modifier
                        .progressSemantics()
                        .size(32.dp),)

                }
            },

            modifier= modifier


        )
    }
