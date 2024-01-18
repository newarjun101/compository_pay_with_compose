package com.prolaymm.compository.presentation.composables


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prolaymm.compository.R
import com.prolaymm.compository.presentation.ui_vos.UiCategoryVo
import com.prolaymm.compository.ui.theme.CategoryIconColor
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.LightCyan
import com.prolaymm.compository.ui.theme.OnPrimaryColor


@Composable
fun ColumnIconButton(uiCategoryVo: UiCategoryVo,modifier: Modifier = Modifier) {

    Column(modifier = modifier
        .clip(RoundedCornerShape(12.dp))
        .height(96.dp)
        .width(76.dp)
        .clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = rememberRipple(
                color = HintColor
            ),
            onClick = {

            }
        ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ///verticalAlignment = Alignment.CenterVertically
    ) {

        Box (
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(uiCategoryVo.containerColor)
                .weight(0.7f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center        ){
            Icon(painterResource(id = uiCategoryVo.image),
                contentDescription = "",
                tint = uiCategoryVo.iconBgColor,
                modifier=Modifier.size(32.dp)
            )
        }


        Text(text = uiCategoryVo.title, modifier = Modifier.padding(6.dp), style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Medium, fontSize = 13.sp), maxLines = 1, overflow = TextOverflow.Ellipsis)

    }

}