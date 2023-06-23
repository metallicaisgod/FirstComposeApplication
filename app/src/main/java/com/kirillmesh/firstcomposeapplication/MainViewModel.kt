package com.kirillmesh.firstcomposeapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _isFollow = MutableLiveData<Boolean>()
    val isFollow: LiveData<Boolean> = _isFollow

    fun changeFollowState(){
        val wasFollow = _isFollow.value ?: false
        _isFollow.value = !wasFollow
    }
}