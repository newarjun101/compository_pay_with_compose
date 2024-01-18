package com.prolaymm.compository.presentation.screens.balance_page

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prolaymm.compository.domain.vos.BankAccountVo
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.ui.theme.CategoryIconColor
import com.prolaymm.compository.ui.theme.HintColor

@Composable
fun AccountBalance(

    bankAccountVo: BankAccountVo,
    modifier: Modifier,
    onClick : ()-> Unit
) {
    Column(modifier = modifier
        .clip(RoundedCornerShape(12.dp))
        .height(96.dp)
        .background(bankAccountVo.containerColor)
        .clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = rememberRipple(
                color = HintColor
            ),
            onClick = onClick
        ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ///verticalAlignment = Alignment.CenterVertically
    ) {
        SizedBox(height = 4.dp)

        Text(
            text = bankAccountVo.bankName,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = bankAccountVo.textColor,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = bankAccountVo.accountNumber,
            modifier = Modifier.padding(6.dp),
            color = CategoryIconColor,
            maxLines = 1,
            letterSpacing = 0.5.sp,
            fontSize=12.sp,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = "${bankAccountVo.balance}",
            fontWeight = FontWeight.Bold,
            color = CategoryIconColor,
            maxLines = 1,
            fontSize = 18.sp,
            overflow = TextOverflow.Ellipsis
        )
        SizedBox(height = 4.dp)

    }

}