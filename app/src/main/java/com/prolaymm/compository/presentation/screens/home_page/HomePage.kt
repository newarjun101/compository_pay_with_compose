package com.prolaymm.compository.presentation.screens.home_page

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prolaymm.compository.domain.vos.UserTransitionHistoryVo
import com.prolaymm.compository.presentation.composables.ColumnIconButton
import com.prolaymm.compository.presentation.composables.CustomNetworkImage
import com.prolaymm.compository.presentation.composables.RowIconButton
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.LightHint
import com.prolaymm.compository.utils.Constants
import com.prolaymm.compository.utils.kDefaultMarginWidth
import com.prolaymm.compository.viewmodel.HomeViewModel



@Composable
fun HomePage(homeViewModel: HomeViewModel) {

    val mBankingList = Constants.bankingList
    val mBillingList = Constants.billingList

    val historyList : List<UserTransitionHistoryVo> = homeViewModel.historyList.collectAsState().value


    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top
    ) {
        MoneyTransfer("Money Transfer")

        SizedBox(height = 8.dp)
        LazyVerticalGrid(
            userScrollEnabled = false,
            modifier = Modifier
                .height(136.dp)
                .padding(8.dp),
            columns = GridCells.Fixed(2)
        ) {
            itemsIndexed(mBankingList) { position, vo ->
                RowIconButton(
                    uiCategoryVo = vo,
                    modifier = Modifier.padding(bottom = 8.dp, start = 4.dp, end = 4.dp)
                )
            }
        }

        MoneyTransfer("Recharge & Bill Payments")

        SizedBox(height = 8.dp)
        LazyVerticalGrid(
            userScrollEnabled = false,
            modifier = Modifier
                .height(126.dp)
                .padding(8.dp),
            columns = GridCells.Fixed(2)
        ) {
            itemsIndexed(mBillingList) { position, vo ->
                RowIconButton(
                    uiCategoryVo = vo,
                    modifier = Modifier.padding(bottom = 8.dp, start = 4.dp, end = 4.dp)
                )
            }
        }
        SizedBox(height = 6.dp)
        MoneyTransfer("Ticket Booking", isContainMore = false)
        SizedBox(height = 8.dp)
        LazyRow(
            modifier = Modifier.padding(horizontal = kDefaultMarginWidth)
        ) {
            itemsIndexed(Constants.ticketList) { position, vo ->
                ColumnIconButton(
                    uiCategoryVo = vo,
                    Modifier.padding(bottom = 8.dp, start = 4.dp, end = 4.dp)
                )
            }
        }
        SizedBox(height = 6.dp)
        MoneyTransfer("More Services", isContainMore = false)
        SizedBox(height = 8.dp)
        LazyRow(
            modifier = Modifier.padding(horizontal = kDefaultMarginWidth)
        ) {
            itemsIndexed(Constants.serviceList) { position, vo ->
                ColumnIconButton(
                    uiCategoryVo = vo,
                    Modifier.padding(bottom = 8.dp, start = 4.dp, end = 4.dp)
                )
            }
        }
        SizedBox(height = 6.dp)
        MoneyTransfer("Recent Transitions", isContainMore = false)
        SizedBox(height = 8.dp)

      //  Text("${historyList}")



      LazyRow(
            modifier = Modifier.padding(horizontal = kDefaultMarginWidth)
        ) {
            itemsIndexed(historyList) { position, vo ->

                Column(
                    Modifier
                        .padding(horizontal = 4.dp)
                        .size(100.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                    CustomNetworkImage(
                        imageUrl = vo.profile ?: "",
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(70.dp),
                    )
                    SizedBox(height = 4.dp)
                    Text("${vo.name}", textAlign = TextAlign.Center, style = MaterialTheme.typography.bodyMedium.copy(color = HintColor, fontWeight = FontWeight.Medium))
                }

            }
        }
        SizedBox(height = 20.dp)
    }
}

@Composable
fun MoneyTransfer(title: String, isContainMore: Boolean = true) {

    Row(

        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = kDefaultMarginWidth),
    ) {

        Text(text = title, style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.weight(1f))
        if (isContainMore) Row(
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
            Icon(Icons.Outlined.KeyboardArrowRight,
                contentDescription = "",
                tint = HintColor,
                modifier = Modifier
                    .fillMaxHeight()
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = rememberRipple(
                            color = HintColor
                        ),
                        onClick = {

                        }
                    ))
        }
    }
}

