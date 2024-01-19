package com.prolaymm.compository.utils

import androidx.compose.ui.graphics.Color
import com.prolaymm.compository.R
import com.prolaymm.compository.domain.vos.BankAccountVo
import com.prolaymm.compository.domain.vos.NotificationVo
import com.prolaymm.compository.domain.vos.SettingVo
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

    val offerList = listOf<NotificationVo>(
        NotificationVo(
            title = "Mobile Recharge Offer",
            code = "FIRST20",
            subtitle = "Get 20 % Instant cashback upto Rs 50 on your firs mobile recharge. T&C apply",
            image = R.drawable.a,
            containerColor = Color(0xffEDF6FF)
        ),
        NotificationVo(
            title = "DTH Recharge Offer",
            subtitle = "Get 20 % Instant cashback upto Rs 50 on your first DTH recharge. T&C apply",
            code = "FIRSDTHT20",
            image = R.drawable.b,
            containerColor = Color(0xffFFEDED)
        ),
        NotificationVo(
            title = "Flipcart Shopping Offer",
            subtitle = "Shop on Flipcart using our payment system to get upto 50% cashback . T&C appply",
            image = R.drawable.c,
            containerColor = Color(0xffEDFFEF)
        ),
        NotificationVo(
            title = "Money Transfer Offer",
            subtitle = "Get a scratch card with assuerd casbck and coupons on Money Transfer of Rs 500 or more . T&C apply",
            image = R.drawable.d,
            containerColor = Color(0xffFFFFED)
        ),
        NotificationVo(
            title = "Rs 50 Off on Flights",
            subtitle = "Get instant discount on flat 50 Rs on Flight ticket booking. T&C apply",
            code = "",
            image = R.drawable.e,
            containerColor = Color(0xffF2EDFF)
        ),

        )
    val rewardList = listOf<NotificationVo>(
        NotificationVo(
            title = "Flat 50 off On food Delivery",
            subtitle = "On orders above 99 on Swaggy, Somato",
            image = R.drawable.one,
            containerColor = Color(0xffEDFFF9)
        ),
        NotificationVo(
            title = "20% Cashback On Amason",
            subtitle = "Up to Rs 150 Minimum Order 1000",
            image = R.drawable.two,
            containerColor = Color(0xffEDFFF9)
        )
    )

    val firstSetting = listOf<SettingVo>(

        SettingVo(name = "All Transactions", image = R.drawable.bill),
        SettingVo(name = "Pending Transactions", image = R.drawable.caution_sign),
        SettingVo(name = "Refund status", image = R.drawable.clock),
        SettingVo(name = "Raise an issue", image = R.drawable.caution),
        SettingVo(name = "Help and Support", image = R.drawable.heart),
    )

    val secondSetting = listOf<SettingVo>(
        SettingVo(name = "About Us", image = R.drawable.caution_sign),
        SettingVo(name = "Terms and Conditions", image = R.drawable.caution),
        SettingVo(name = "Feedback", image = R.drawable.heart),
    )
}