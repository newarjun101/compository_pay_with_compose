package com.prolaymm.compository.domain.vos

data class SettingVo(val name : String, val image : Int, val onClick : ()-> Unit = {})