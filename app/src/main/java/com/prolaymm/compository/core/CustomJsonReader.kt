package com.prolaymm.compository.core

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import com.prolaymm.compository.R
import com.prolaymm.compository.domain.vos.UserTransitionHistoryVo
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class CustomJsonReader @Inject constructor(@ApplicationContext private val appContext: Context) {

    fun <T> onReadJsonDataFromAsset(assetFile: String): T {

        val typeToken = object : TypeToken<List<UserTransitionHistoryVo>>() {}.type
        val fileInString: String =
            appContext.assets.open(assetFile).bufferedReader().use { it.readText() }
        return Gson().fromJson(fileInString, typeToken)
    }



}

