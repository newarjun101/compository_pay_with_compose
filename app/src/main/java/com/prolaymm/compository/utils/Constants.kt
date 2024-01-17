package com.prolaymm.compository.utils

import androidx.compose.ui.graphics.Color
import com.prolaymm.compository.R
import com.prolaymm.compository.presentation.ui_vos.UiCategoryVo
import com.prolaymm.compository.ui.theme.LightCyan
import com.prolaymm.compository.ui.theme.OnPrimaryColor

object Constants {
    val bankingList: List<UiCategoryVo> = listOf(
        UiCategoryVo(
            title = "Scan QR Code",
            image = R.drawable.scanner,
            containerColor = Color(0xFFEDEFFF),
            iconBgColor = OnPrimaryColor
        ),
        UiCategoryVo(
            title = "Send to Contact",
            image = R.drawable.add_user,
            containerColor = LightCyan,
            iconBgColor = Color(0xFFD5FFFF)
        ),
        UiCategoryVo(
            title = "Send To Bank",
            image = R.drawable.bank,
            containerColor = LightCyan,
            iconBgColor = Color(0xFFE3FFCE)
        ),
        UiCategoryVo(
            title = "Self Transfer",
            image = R.drawable.refresh,
            containerColor = LightCyan,
            iconBgColor = Color(0xFFFFB9F8)
        ),
    )

    val billingList: List<UiCategoryVo> = listOf(
        UiCategoryVo(
            title = "Mobile Recharge",
            image = R.drawable.scanner,
            containerColor = LightCyan,
            iconBgColor = OnPrimaryColor
        ),
        UiCategoryVo(
            title = "Electricity Bill",
            image = R.drawable.add_user,
            containerColor = LightCyan,
            iconBgColor = Color(0xFFFFD8FB)
        ),
        UiCategoryVo(
            title = "DTH Recharge",
            image = R.drawable.bank,
            containerColor = LightCyan,
            iconBgColor = Color(0xFFE3FFCE)
        ),
        UiCategoryVo(
            title = "Postpaid bill",
            image = R.drawable.refresh,
            containerColor = LightCyan,
            iconBgColor = Color(0xFFFFB9F8)
        ),
    )
}