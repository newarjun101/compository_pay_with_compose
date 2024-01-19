package com.prolaymm.compository.presentation.screens.main_page

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.prolaymm.compository.presentation.composables.CustomNetworkImage
import com.prolaymm.compository.presentation.composables.CustomSearchField
import com.prolaymm.compository.presentation.routes.rComingSoon
import com.prolaymm.compository.presentation.routes.rProfile
import com.prolaymm.compository.presentation.screens.balance_page.BalancePage
import com.prolaymm.compository.presentation.screens.home_page.HomePage
import com.prolaymm.compository.presentation.screens.offers_page.OfferPage
import com.prolaymm.compository.presentation.screens.reward_page.RewardPage
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.LightHint
import com.prolaymm.compository.ui.theme.Pink40
import com.prolaymm.compository.ui.theme.PinkColor
import com.prolaymm.compository.ui.theme.PrimaryColor
import com.prolaymm.compository.utils.kDefaultMarginWidth
import com.prolaymm.compository.viewmodel.HomeViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun MainPage(navController: NavController) {
    val tabs = listOf("Home", "Balance", "Offers", "Rewards")
    val pagerState = rememberPagerState(pageCount = {
        tabs.size
    })
    val coroutineScope = rememberCoroutineScope()


    var tabIndex by remember { mutableStateOf(0) }

    Scaffold(

        topBar = {
            Column(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(24.dp))
                    .background(Color.White)
                    .padding(horizontal = kDefaultMarginWidth)


            ) {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.White,

                    ),
                    title = {

                        Row(
                            // modifier = Modifier.padding(top = 8.dp, end = kDefaultMarginWidth),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            CustomNetworkImage(
                                imageUrl = "https://cdn.pixabay.com/photo/2023/04/14/23/47/ai-generated-7926659_1280.jpg",
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .size(50.dp)
                                    .clickable {
                                        navController.navigate(rProfile)
                                    }
                            )
                            CustomSearchField(inputText = "",
                                hintText = "Search here",
                                readOnly = true,
                                modifier = Modifier
                                    .height(46.dp)

                                    .weight(1f)
                                    .padding(horizontal = kDefaultMarginWidth)
                                    .clickable {
                                        navController.navigate(rComingSoon)
                                    }

                            )

                            Box(
                                modifier = Modifier
                                    .size(40.dp)
                                    .clip(shape = CircleShape)
                                    .background(LightHint)
                                    .padding(9.dp)
                                    .clickable {
                                        navController.navigate(rComingSoon)
                                    }


                            ) {

                                Icon(
                                    Icons.Outlined.Notifications,
                                    contentDescription = "",
                                    modifier = Modifier.align(
                                        Alignment.Center
                                    ),
                                    tint = HintColor
                                )
                                Box(
                                    modifier = Modifier
                                        .size(10.dp)
                                        .clip(shape = CircleShape)
                                        .background(if (tabIndex == tabs.size - 1) PinkColor else PrimaryColor)
                                        .align(Alignment.TopEnd)


                                )

                            }
                        }
                    })///TopAppBar br

                TabRow(
                    divider = {
                        Divider(color = Color.Transparent,)
                    },

                    indicator = { tabPositions ->
                        Box(
                            modifier = Modifier
                                .tabIndicatorOffset(tabPositions[tabIndex])
                                .height(4.dp)
                                // clip modifier not working
                                .padding(horizontal = 14.dp)
                                .clip(RoundedCornerShape(30.dp))
                                .background(color = if (tabIndex == tabs.size - 1) PinkColor else PrimaryColor)
                        )
                    },
                    containerColor = Color.White,

                    selectedTabIndex = tabIndex
                ) {

                    tabs.forEachIndexed { index, title ->
                        Tab(text = {
                            Text(
                                title,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                        },
                            selected = tabIndex == index,

                            selectedContentColor =if(tabIndex == tabs.size-1) PinkColor else  PrimaryColor,
                            unselectedContentColor = HintColor,
                            interactionSource = object : MutableInteractionSource {
                                override val interactions: Flow<Interaction> = emptyFlow()

                                override suspend fun emit(interaction: Interaction) {}

                                override fun tryEmit(interaction: Interaction) = true
                            },

                            onClick = {

                                tabIndex = index
                            }
                        )
                    }

                }
            }
        }
    ) {

            paddingValues ->

       Box(modifier = Modifier
           .padding(
               top = paddingValues.calculateTopPadding(),
           )
           .fillMaxHeight()) {
           when (tabIndex) {
               0 -> HomePage(homeViewModel = hiltViewModel<HomeViewModel>())
               1 -> BalancePage(navController)
               2 ->  OfferPage(navController)
               3 -> RewardPage(navController)
           }
       }

    /*    HorizontalPager(
            state = pagerState, modifier = Modifier
                .padding(
                    top = paddingValues.calculateTopPadding(),
                ).fillMaxHeight()
            ,
            verticalAlignment = Alignment.Top

        ) { page ->

            when (pagerState.currentPage) {
                0 -> HomePage()
                1 -> Text(text = "Second page")
                2 -> Text(text = "Third page")
                3 -> Text(text = "Fourth page")
            }
        }*/
    }
}