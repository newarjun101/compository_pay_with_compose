package com.prolaymm.compository.utils

import androidx.compose.ui.graphics.Color
import com.prolaymm.compository.R
import com.prolaymm.compository.domain.vos.BankAccountVo
import com.prolaymm.compository.presentation.ui_vos.UiCategoryVo
import com.prolaymm.compository.ui.theme.LightCyan
import com.prolaymm.compository.ui.theme.OnPrimaryColor
import com.prolaymm.compository.ui.theme.PrimaryColor

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
            image = R.drawable.phone,
            containerColor = LightCyan,
            iconBgColor = OnPrimaryColor
        ),
        UiCategoryVo(
            title = "Electricity Bill",
            image = R.drawable.light,
            containerColor = LightCyan,
            iconBgColor = Color(0xFFFFD8FB)
        ),
        UiCategoryVo(
            title = "DTH Recharge",
            image = R.drawable.play,
            containerColor = LightCyan,
            iconBgColor = Color(0xFFE3FFCE)
        ),
        UiCategoryVo(
            title = "Postpaid bill",
            image = R.drawable.bill,
            containerColor = LightCyan,
            iconBgColor = Color(0xFFFFB9F8)
        ),
    )

    val ticketList: List<UiCategoryVo> = listOf(
        UiCategoryVo(
            title = "Movies",
            image = R.drawable.video_play,
            containerColor = Color(0xffFFEDF1),
            iconBgColor = Color(0xFFFA4D96)
        ),
        UiCategoryVo(
            title = "Trains",
            image = R.drawable.light,
            containerColor = Color(0xffFFEDF1),
            iconBgColor = Color(0xFFFA4D96)
        ),
        UiCategoryVo(
            title = "Bus",
            image = R.drawable.play,
            containerColor = Color(0xffFFEDF1),
            iconBgColor = Color(0xFFFA4D96)
        ),
        UiCategoryVo(
            title = "Flight",
            image = R.drawable.airplane,
            containerColor = Color(0xffFFEDF1),
            iconBgColor = Color(0xFFFA4D96)
        ),
        UiCategoryVo(
            title = "Cars",
            image = R.drawable.bill,
            containerColor = Color(0xffFFEDF1),
            iconBgColor = Color(0xFFFA4D96)
        ),
    )
    val serviceList: List<UiCategoryVo> = listOf(
        UiCategoryVo(
            title = "Invest",
            image = R.drawable.stock,
            containerColor = OnPrimaryColor,
            iconBgColor = PrimaryColor
        ),
        UiCategoryVo(
            title = "Loans",
            image = R.drawable.percent,
            containerColor = OnPrimaryColor,
            iconBgColor = PrimaryColor
        ),
        UiCategoryVo(
            title = "Insurance",
            image = R.drawable.heart,
            containerColor = OnPrimaryColor,
            iconBgColor = PrimaryColor
        ),
        UiCategoryVo(
            title = "Fastag",
            image = R.drawable.smart_car,
            containerColor = OnPrimaryColor,
            iconBgColor = PrimaryColor
        ),

        )


    val bankAccountList = listOf<BankAccountVo>(

        BankAccountVo(
            bankName = "Federel Bank",
            accountNumber = "1142524899652",
            balance = 16456.05,
            containerColor = Color(0xffF4EDFF),
            textColor = Color(0xff8F4DFA)
        ),
        BankAccountVo(
            bankName = "States Bank",
            accountNumber = "1142524899652",
            balance = 2045.05,
            containerColor = Color(0xffFFEDF1),
            textColor = Color(0xffFA4D96)
        ),
        BankAccountVo(
            bankName = "Best Bank",
            accountNumber = "1142521547852",
            balance = 35873.5,
            containerColor = Color(0xffEDFFF4),
            textColor = Color(0xff4DA7FA)
        ),
    )
}