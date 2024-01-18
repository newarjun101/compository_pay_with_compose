package com.prolaymm.compository.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prolaymm.compository.core.CustomJsonReader
import com.prolaymm.compository.domain.vos.UserTransitionHistoryVo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import java.util.Arrays
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val  customJsonReader: CustomJsonReader) : ViewModel(){

    val historyList = MutableStateFlow(emptyList<UserTransitionHistoryVo>())

    init {
        Log.d("Arjun","Success in viewmodel")
        onReadJson()
    }
    private fun onReadJson() {
        viewModelScope.launch(Dispatchers.IO) {
     try {

         val data  =  customJsonReader.onReadJsonDataFromAsset<List<UserTransitionHistoryVo>>("history_data.json")
         historyList.value = data
     } catch (error :Exception){
         Log.d("Arjun","json read error $error")
     }
        }


    }
}