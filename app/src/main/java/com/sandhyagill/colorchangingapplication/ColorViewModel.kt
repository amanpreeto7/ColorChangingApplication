package com.sandhyagill.colorchangingapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @Author: 017
 * @Date: 13/02/24
 * @Time: 11:34 am
 */
class ColorViewModel : ViewModel() {
     var color : MutableLiveData<Int> = MutableLiveData()
}