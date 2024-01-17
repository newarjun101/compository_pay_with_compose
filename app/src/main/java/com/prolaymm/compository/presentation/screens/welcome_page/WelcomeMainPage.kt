package com.prolaymm.compository.presentation.screens.welcome_page

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.prolaymm.compository.R
import com.prolaymm.compository.presentation.composables.CustomButton
import com.prolaymm.compository.presentation.composables.SizedBox
import com.prolaymm.compository.presentation.routes.rLogin
import com.prolaymm.compository.presentation.routes.rWelcome
import com.prolaymm.compository.presentation.ui_vos.WelcomeVo
import com.prolaymm.compository.ui.theme.HintColor
import com.prolaymm.compository.ui.theme.PrimaryColor
import com.prolaymm.compository.utils.kDefaultMarginWidth
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun WelcomeMainPage(navController: NavController) {

    val pagerList = listOf<WelcomeVo>(
        WelcomeVo(
            image = R.drawable.pay_one,
            title = "Simplifying Transactions, Amplifying Convenience",
            subtitle = "Payment apps prioritize the security of financial information",
        ),
        WelcomeVo(
            image = R.drawable.pay_two,
            title = "ConpositoryPay: Your Key to Instant, Secure Payments",
            subtitle = "Users can make transactions from the comfort of their mobile devices",
        ),
        WelcomeVo(
            image = R.drawable.final_pay,
            title = "PayEase: Effortless Payments at Your Fingertips",
            subtitle = "Many payment apps allow users to send money directly to friends, family",
        )
    )
    var buttonText by remember {
        mutableStateOf("")
    }
    val coroutineScope =  rememberCoroutineScope()
    val pagerState = rememberPagerState(pageCount = {
        3
    })

    LaunchedEffect(key1 = pagerState.currentPage) {

        buttonText = if (pagerState.currentPage == pagerState.pageCount - 1) {
            "SIGN IN"
        } else {
            "NEXT"
        }
        Log.d("Arjun", "Arjun ${pagerState.currentPage} ${pagerState.pageCount}")
    }
    Column {
        Box(

            modifier = Modifier.weight(0.5f)
        ) {
            HorizontalPager(state = pagerState) { page ->
                // Our page content
                ComposableWelcome(pagerList[page])
            }
            if (pagerState.currentPage != pagerState.pageCount - 1) CustomButton(
                text = "Skip",
                modifier = Modifier
                    .padding(kDefaultMarginWidth)
                    .height(28.dp)
                    .align(Alignment.TopEnd),
                style = TextStyle(fontSize = 10.sp),
                buttonColors = ButtonDefaults.buttonColors(containerColor = HintColor)
            ) {
                navController.navigate(rLogin) {
                    popUpTo(rWelcome) {
                        inclusive = true
                    }
                }
            }
        }

        CustomButton(
            text = buttonText, modifier = Modifier
                .fillMaxWidth()
                .padding(kDefaultMarginWidth)
        ) {
            //  navController.popBackStack(rLogin, inclusive = false, saveState = false)
            if (pagerState.currentPage == pagerState.pageCount - 1) {
                navController.navigate(rLogin) {
                    popUpTo(rWelcome) {
                        inclusive = true
                    }
                }
            } else {
               coroutineScope.launch(Dispatchers.Main) {
                   pagerState.scrollToPage(pagerState.currentPage + 1)
               }
            }
        } ///custom button

        SizedBox(height = 12.dp)
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {

            repeat(3) { currentValue ->
                Spacer(
                    modifier = Modifier
                        .padding(end = 6.dp)
                        .height(12.dp)
                        .width(12.dp)
                        .clip(shape = RoundedCornerShape(100.dp))
                        .background(if (pagerState.currentPage == currentValue) PrimaryColor else HintColor)

                )
            }
        }

        SizedBox(height = 28.dp)

    }

}