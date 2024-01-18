package com.prolaymm.compository.presentation.routes

sealed  class Route(val route : String) {

    data object Welcome : Route(route = rMainPage)
}