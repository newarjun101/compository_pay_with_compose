package com.prolaymm.compository.presentation.screens.receive_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.prolaymm.compository.R
import io.github.alexzhirkevich.qrose.QrData
import io.github.alexzhirkevich.qrose.email
import io.github.alexzhirkevich.qrose.options.QrBallShape
import io.github.alexzhirkevich.qrose.options.QrBrush
import io.github.alexzhirkevich.qrose.options.QrCodeShape
import io.github.alexzhirkevich.qrose.options.QrErrorCorrectionLevel
import io.github.alexzhirkevich.qrose.options.QrFrameShape
import io.github.alexzhirkevich.qrose.options.QrLogoPadding
import io.github.alexzhirkevich.qrose.options.QrLogoShape
import io.github.alexzhirkevich.qrose.options.QrPixelShape
import io.github.alexzhirkevich.qrose.options.brush
import io.github.alexzhirkevich.qrose.options.circle
import io.github.alexzhirkevich.qrose.options.hexagon
import io.github.alexzhirkevich.qrose.options.image
import io.github.alexzhirkevich.qrose.options.roundCorners
import io.github.alexzhirkevich.qrose.options.solid
import io.github.alexzhirkevich.qrose.rememberQrCodePainter


@Composable
fun QrImage() {



    val logo = painterResource(R.drawable.video_play)

    val painter = rememberQrCodePainter("https://github.com/prolaymm") {
        logo {
            painter = logo
            padding = QrLogoPadding.Natural(.0f)
            shape = QrLogoShape.circle()
            size = 0.2f
        }

        shapes() {
            ball = QrBallShape.circle()
            darkPixel = QrPixelShape.roundCorners()
            frame = QrFrameShape.roundCorners(2.0f)
        }
        colors {
            dark = QrBrush.brush {
                Brush.linearGradient(
                    0f to Color.Black,
                    1f to Color.Black,
                    end = Offset(it, it)
                )
            }
            frame = QrBrush.solid(Color.Black)
        }
    }

    Image(
        painter = painter,
        contentDescription = null,
        modifier = Modifier.padding(vertical = 12.dp)
            .size(300.dp)

    )
}

