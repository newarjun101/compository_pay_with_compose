package com.prolaymm.compository.presentation.screens.profile_page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.utils.Constants

@Composable
fun  ProfilePage() {


   Column {
       SizedBox(height = 20.dp)
       ProfileCard()
    LazyColumn{
        item {
            SettingCard(settingList = Constants.firstSetting)
            SizedBox(height = 20.dp)
            SettingCard(settingList = Constants.secondSetting)
        }
    }
   }
}