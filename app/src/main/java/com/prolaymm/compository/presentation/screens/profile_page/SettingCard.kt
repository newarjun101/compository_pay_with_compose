package com.prolaymm.compository.presentation.screens.profile_page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prolaymm.compository.domain.vos.SettingVo
import com.prolaymm.compository.ui.theme.CategoryIconColor
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.utils.kDefaultMarginWidth

@Composable
fun SettingCard(settingList: List<SettingVo>) {

    Box(
        modifier = Modifier
            .padding(horizontal = kDefaultMarginWidth)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
            .padding(horizontal = 12.dp)
    ) {

        Column {
            settingList.forEach { vo ->
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                    ) {
                    Icon(
                        painter = painterResource(id = vo.image),
                        contentDescription = "",
                        tint = HintColor,
                        modifier = Modifier.size(32.dp)
                    )
                    Text(
                        vo.name,
                        Modifier
                            .weight(1f)
                            .padding(horizontal = 12.dp ),
                        fontSize = 16.sp,
                        color = CategoryIconColor
                    )
                    Icon(
                        Icons.Outlined.KeyboardArrowRight,
                        contentDescription = "",
                        tint = HintColor,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }
}