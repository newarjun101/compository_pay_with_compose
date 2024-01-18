package com.prolaymm.compository.presentation.screens.reward_page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.prolaymm.compository.presentation.composables.NotificationCard
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.presentation.routes.rReceive
import com.prolaymm.compository.utils.Constants
import com.prolaymm.compository.utils.kDefaultMarginWidth

@Composable
fun RewardPage(navController: NavController) {

    Column {

        RewardBalanceCard(){
            navController.navigate(rReceive)
        }

        Text(
            "Casbacks earned",
            modifier = Modifier.padding(horizontal = kDefaultMarginWidth, vertical = 8.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )
        LazyColumn(
            modifier = Modifier.padding(horizontal = kDefaultMarginWidth)
        ){

            items(Constants.rewardList.size) {
                position ->
                NotificationCard(notificationVo = Constants.rewardList[position], modifier = Modifier.padding(bottom = 12.dp), isButton = true){
                    navController.navigate(rReceive)
                }

            }
        }
    }
}