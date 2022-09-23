package com.vansuita.dice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val dice = Dice(6)

    private var mutableResult = MutableLiveData<Int>()
    val result : LiveData<Int> = mutableResult

    fun execute(){
        mutableResult.postValue(dice.roll())
    }


}