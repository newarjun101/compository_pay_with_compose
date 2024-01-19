package com.prolaymm.compository.presentation.screens.profile_page

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prolaymm.compository.R
import com.prolaymm.compository.presentation.composables.AnimationProgressBar
import com.prolaymm.compository.presentation.composables.CustomButton
import com.prolaymm.compository.presentation.composables.CustomNetworkImage
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.presentation.routes.rReceive
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.LightCyan
import com.prolaymm.compository.ui.theme.OnPrimaryColor
import com.prolaymm.compository.ui.theme.PrimaryColor
import com.prolaymm.compository.utils.kDefaultMarginWidth

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun  ProfileCard() {

    Box(
        modifier = Modifier
            .padding(16.dp)
            .border(1.dp, LightCyan, shape = RoundedCornerShape(12.dp))
            .shadow(
                elevation = 3.dp,
                shape = RoundedCornerShape(12.dp)
            )
            .background(Color.White)
            .fillMaxWidth()
            .padding(kDefaultMarginWidth),
    ) {

        Column {
            Row {
                CustomNetworkImage(
                    imageUrl = "https://cdn.pixabay.com/photo/2023/04/14/23/47/ai-generated-7926659_1280.jpg",
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(60.dp)
                )
                SizedBox(width = 8.dp)
                Column {
                    Text("Elsa", style = MaterialTheme.typography.headlineMedium.copy(color= HintColor))
                    Text("Level 4 Ace Member", style = MaterialTheme.typography.bodySmall.copy(color= HintColor))
                    AnimationProgressBar(modifier = Modifier)


                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
            ) {

                ScoreCompose(title = "Transactions",value = "1,208")
                ScoreCompose(title = "Points",value = "726", modifier = Modifier.padding(horizontal = 16.dp))
                ScoreCompose(title = "Rank",value = "8")
                MyIconButton("Explore", icon = R.drawable.circular_forward)

            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                MyIconButton("Edit", icon = R.drawable.user_edit)
                MyIconButton("Settings", icon = R.drawable.union)
                MyIconButton("Share", icon = R.drawable.share)
            }

        }

    }
}

@Composable
private  fun MyIconButton(title : String,icon: Int) {

    CustomButton(text = "Add / Manage Accounts",
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .width(90.dp)
            .height(32.dp),
        buttonColors = ButtonDefaults.buttonColors(
            containerColor = Color(0xffEDEFFF),
            contentColor = PrimaryColor
        ),
        content = {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 6.dp)
            ) {
                Text(title, style = MaterialTheme.typography.bodySmall, modifier = Modifier.weight(1f))
                Icon(painter = painterResource(id = icon),contentDescription = "", tint = HintColor, modifier = Modifier.size(14.dp))
            }
        }
    ) {

    }
}