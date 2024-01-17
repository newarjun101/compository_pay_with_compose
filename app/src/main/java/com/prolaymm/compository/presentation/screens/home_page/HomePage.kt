package com.prolaymm.compository.presentation.screens.home_page

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import com.prolaymm.compository.presentation.composables.RowIconButton
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.LightHint
import com.prolaymm.compository.utils.Constants
import com.prolaymm.compository.utils.kDefaultMarginWidth


@Composable
fun  HomePage() {

    val mBankingList = Constants.bankingList
    val mBillingList = Constants.billingList
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        MoneyTransfer("Money Transfer",)

        SizedBox(height = 8.dp)
        LazyVerticalGrid(
            userScrollEnabled = false,
            modifier = Modifier
                .height(136.dp)
                .padding(8.dp),
            columns = GridCells.Fixed(2)
        ) {
            itemsIndexed(mBankingList) { position, vo ->
                RowIconButton(uiCategoryVo = vo, modifier = Modifier.padding(bottom = 8.dp, start = 4.dp, end = 4.dp))
            }
        }

        MoneyTransfer("Recharge & Bill Payments",)

        SizedBox(height = 8.dp)
        LazyVerticalGrid(
            userScrollEnabled = false,
            modifier = Modifier
                .height(126.dp)
                .padding(8.dp),
            columns = GridCells.Fixed(2)
        ) {
            itemsIndexed(mBillingList) { position, vo ->
                RowIconButton(uiCategoryVo = vo, modifier = Modifier.padding(bottom = 8.dp, start = 4.dp, end = 4.dp))
            }
        }

        MoneyTransfer("Ticket Booking",isContainMore = false)

    }
}

@Composable
fun MoneyTransfer(title :String,isContainMore: Boolean = true) {

    Row(

        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = kDefaultMarginWidth)) {

        Text(text = title, style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.weight(1f))
     if(isContainMore)   Row(
            modifier = Modifier
                .width(68.dp)
                .height(32.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(LightHint)
                .padding(6.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween


        ) {
            Text(text = "More", style = MaterialTheme.typography.bodySmall)
            Icon(Icons.Outlined.KeyboardArrowRight,contentDescription = "", tint = HintColor, modifier = Modifier.fillMaxHeight())
        }
    }
}

