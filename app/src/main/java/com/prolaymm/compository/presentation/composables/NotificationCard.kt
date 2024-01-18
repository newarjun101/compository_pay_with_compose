package com.prolaymm.compository.presentation.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prolaymm.compository.domain.vos.NotificationVo
import com.prolaymm.compository.ui.theme.CategoryIconColor
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.PinkColor

@SuppressLint("SuspiciousIndentation")
@Composable
fun NotificationCard( modifier : Modifier = Modifier,notificationVo: NotificationVo,isButton:Boolean = false,onClick: ()-> Unit) {

    Row(modifier = modifier
        .clip(RoundedCornerShape(12.dp))
        .fillMaxWidth()
        .background(notificationVo.containerColor)
        .clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = rememberRipple(
                color = HintColor
            ),
            onClick = {

            }
        ) .requiredHeightIn(100.dp) .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {

        Image(
            painterResource(id = notificationVo.image),
            contentDescription = "",
         //   tint = CategoryIconColor,
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                // .background(notificationVo.iconBgColor)
                .size(58.dp)
                .padding(end=8.dp),

            )

      Column(
         horizontalAlignment = Alignment.Start,
      ) {
          Text(text = notificationVo.title, style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Medium, color = CategoryIconColor))
        if(notificationVo.code.isNotBlank())  Text(text = "Use Code ${notificationVo.code}", modifier = Modifier.padding(vertical = 2.dp), style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Medium, color = CategoryIconColor, fontSize = 14.sp))
          Text(text = notificationVo.subtitle, style = MaterialTheme.typography.bodySmall.copy(fontSize = 12.sp, color = CategoryIconColor))
          if(isButton)    CustomButton(text = "Collect Now",
              shape = RoundedCornerShape(12.dp),
              modifier = Modifier
                  .padding(top = 8.dp)
                  .width(90.dp).height(34.dp),
              buttonColors = ButtonDefaults.buttonColors(
                  containerColor = PinkColor.copy(alpha = 0.15f),
                  contentColor = PinkColor
              )
          ) {

          }
      }
    }
}