package com.prolaymm.compository.presentation.screens.balance_page

import android.widget.GridView
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.size.Size
import com.prolaymm.compository.R
import com.prolaymm.compository.presentation.composables.CustomButton
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.ui.theme.CategoryIconColor
import com.prolaymm.compository.ui.theme.LightCyan
import com.prolaymm.compository.ui.theme.LightHint
import com.prolaymm.compository.ui.theme.OnPrimaryColor
import com.prolaymm.compository.ui.theme.PrimaryColor
import com.prolaymm.compository.utils.Constants
import com.prolaymm.compository.utils.kDefaultMarginWidth

@Composable
fun BalancePage() {


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
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(kDefaultMarginWidth)
                    .fillMaxWidth()
            ) {
                Icon(painter = painterResource(id = R.drawable.circular_back), tint = CategoryIconColor,contentDescription = "", modifier = Modifier.size(22.dp))
                Icon(painter = painterResource(id = R.drawable.stock),contentDescription = "",tint = CategoryIconColor, modifier = Modifier.size(22.dp))
            }
            Column (
                modifier = Modifier
                    .padding(kDefaultMarginWidth)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                
                Text("Portfolio Value", fontSize = 16.sp, fontWeight = FontWeight.Normal)
                Text("40000 MMK", style = MaterialTheme.typography.headlineLarge.copy(color = CategoryIconColor))
                Text("In 3 Accounts", style = MaterialTheme.typography.bodyLarge.copy(color = CategoryIconColor))
                SizedBox(height = 8.dp)
                LazyVerticalGrid(columns = GridCells.Fixed(2) ){

                    itemsIndexed(Constants.bankAccountList) {

                        position, vo ->

                        AccountBalance(bankAccountVo = vo, modifier = Modifier.padding(start = 6.dp, end = 6.dp, top = 8.dp, bottom = 8.dp))

                    }
                }
                SizedBox(height = 12.dp)
                CustomButton(text = "Add / Manage Accounts",
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .fillMaxWidth(),
                    buttonColors = ButtonDefaults.buttonColors(
                        containerColor = OnPrimaryColor,
                        contentColor = PrimaryColor
                    )
                ) {

                }
            }
        }
    }
}