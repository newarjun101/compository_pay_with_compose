package com.prolaymm.compository.presentation.screens.offers_page

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.prolaymm.compository.presentation.composables.NotificationCard
import com.prolaymm.compository.utils.Constants
import com.prolaymm.compository.utils.kDefaultMarginWidth

@Composable
fun OfferPage() {

    LazyColumn(
        modifier = Modifier.padding(horizontal = kDefaultMarginWidth)
    ){
        itemsIndexed(Constants.offerList) {
            position,vo ->
            NotificationCard(notificationVo = vo, modifier = Modifier.padding(vertical = 12.dp))
        }
    }

}