package com.prolaymm.compository.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prolaymm.compository.R
import com.prolaymm.compository.presentation.ui_vos.UiCategoryVo
import com.prolaymm.compository.ui.theme.CategoryIconColor
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.OnPrimaryColor


@Composable
fun RowIconButton(uiCategoryVo: UiCategoryVo,modifier: Modifier = Modifier) {

    Row(modifier = modifier
        .clip(RoundedCornerShape(12.dp))
        .height(50.dp)
        .background(uiCategoryVo.containerColor),
        verticalAlignment = Alignment.CenterVertically
    ) {

      Icon(painterResource(id = uiCategoryVo.image),
          contentDescription = "",
          tint = CategoryIconColor,
          modifier = Modifier
          .clip(RoundedCornerShape(8.dp))
          .background(uiCategoryVo.iconBgColor)
          .padding(8.dp)
          .fillMaxHeight()
          .width(36.dp),

          )
        
        Text(text = uiCategoryVo.title, modifier = Modifier.padding(6.dp), style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold, fontSize = 13.sp))

    }

}