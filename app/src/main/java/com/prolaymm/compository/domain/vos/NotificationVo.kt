package com.prolaymm.compository.domain.vos

import androidx.compose.ui.graphics.Color

data class NotificationVo (val title: String, val subtitle: String, val image : Int,val code: String = "", val containerColor : Color, val textColor : Color? = null)