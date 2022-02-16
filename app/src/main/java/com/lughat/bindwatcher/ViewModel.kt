package com.lughat.bindwatcher

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

    val upatedText= MutableLiveData("")
   fun onChanged(text: CharSequence){
       upatedText.value = text.toString()
   }
}