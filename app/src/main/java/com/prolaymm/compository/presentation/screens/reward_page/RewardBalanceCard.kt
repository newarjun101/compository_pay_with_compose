package com.prolaymm.compository.presentation.screens.reward_page

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prolaymm.compository.R
import com.prolaymm.compository.presentation.composables.CustomButton
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.presentation.screens.balance_page.AccountBalance
import com.prolaymm.compository.ui.theme.CategoryIconColor
import com.prolaymm.compository.ui.theme.LightCyan
import com.prolaymm.compository.ui.theme.OnPrimaryColor
import com.prolaymm.compository.ui.theme.PinkColor
import com.prolaymm.compository.ui.theme.PrimaryColor
import com.prolaymm.compository.utils.Constants
import com.prolaymm.compository.utils.kDefaultMarginWidth

@Composable
fun RewardBalanceCard(onClick : ()->Unit) {

    Column {

        SizedBox(height = 12.dp)
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
            // .height(200.dp),
        ) {
            Column (
                modifier = Modifier
                    .padding(kDefaultMarginWidth)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){

                Text("Casbacks earned", fontSize = 16.sp, fontWeight = FontWeight.Medium)
                Text("40000 MMK", style = MaterialTheme.typography.headlineLarge.copy(color = CategoryIconColor))
                Text("+ 88 Rs  This month", style = MaterialTheme.typography.bodyLarge.copy(color = CategoryIconColor))

                SizedBox(height = 12.dp)
                CustomButton(text = "Add / Manage Accounts",
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .fillMaxWidth(),
                    buttonColors = ButtonDefaults.buttonColors(
                        containerColor = PinkColor.copy(alpha = 0.1f),
                        contentColor = PinkColor
                    )
                ) {
                    onClick()
                }
            }
        }
    }
}