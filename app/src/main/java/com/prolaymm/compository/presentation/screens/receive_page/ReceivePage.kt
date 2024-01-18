package com.prolaymm.compository.presentation.screens.receive_page

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prolaymm.compository.R
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.ui.theme.CategoryIconColor
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.LightCyan
import com.prolaymm.compository.ui.theme.OnPrimaryColor
import com.prolaymm.compository.ui.theme.PrimaryColor
import com.prolaymm.compository.utils.kDefaultMarginHeight
import com.prolaymm.compository.utils.kDefaultMarginWidth

@Composable
fun ReceivePage() {

    val context = LocalContext.current
    Column {


        SizedBox(height = 12.dp)
        Box(
            modifier = Modifier
                .padding(16.dp)
                .border(1.dp, LightCyan, shape = RoundedCornerShape(12.dp))
                .shadow(
                    elevation = 3.dp,
                    shape = RoundedCornerShape(12.dp)
                )
                .background(Color.White)
                .fillMaxWidth()
                .height(250.dp),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Text(
                    "Casbacks earned",
                    modifier = Modifier
                        .padding(top = 6.dp)
                        .align(Alignment.CenterHorizontally),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
                QrImage()
            }
        }

        Text(
            "Other Options",
            modifier = Modifier
                .padding(horizontal = kDefaultMarginWidth)
                .align(Alignment.Start),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )

        Box(
            modifier = Modifier
                .padding(horizontal = kDefaultMarginWidth, vertical = kDefaultMarginHeight)
                .clip(RoundedCornerShape(12.dp))

                //.height(36.dp)
                .fillMaxWidth()
                .background(OnPrimaryColor)
                .padding(8.dp)
            /*   .clickable(
                   interactionSource = remember { MutableInteractionSource() },
                   indication = rememberRipple(
                       color = HintColor
                   ),
                   onClick = {

                   }
               )*/,
       contentAlignment = Alignment.Center
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Your Pay ID",
                    color = CategoryIconColor,
                    fontSize = 14.sp,

                    )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    "elsa@524899652",
                    color = HintColor,
                    modifier = Modifier.padding(end = 6.dp)

                )
                Icon(
                    painter = painterResource(id = R.drawable.copy),
                    contentDescription = "",
                    tint = CategoryIconColor,
                    modifier = Modifier.clickable{
                        val clipboardManager =
                            context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                        val clip = ClipData.newPlainText("password", "elsa@524899652")
                        clipboardManager.setPrimaryClip(clip)
                        Toast.makeText(context,"Copied",Toast.LENGTH_SHORT).show()
                    }
                )
            }

        }

        Box(
            modifier = Modifier
                .padding(horizontal = kDefaultMarginWidth, vertical = kDefaultMarginHeight)
                .clip(RoundedCornerShape(12.dp))

                //.height(36.dp)
                .fillMaxWidth()
                .background(OnPrimaryColor)
                .padding(8.dp)
              .clickable(
                   interactionSource = remember { MutableInteractionSource() },
                   indication = rememberRipple(
                       color = HintColor
                   ),
                   onClick = {

                   }
               ),
            contentAlignment = Alignment.Center
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Show bank account details",
                    color = PrimaryColor,
                    fontSize = 14.sp,

                    )
                Spacer(modifier = Modifier.weight(1f))

                Icon(
                    Icons.Outlined.KeyboardArrowRight,
                    contentDescription = "",
                    tint = PrimaryColor,
                    modifier = Modifier.clickable{

                        Toast.makeText(context,"Coming Soon",Toast.LENGTH_SHORT).show()
                    }
                )
            }

        }
    }
}