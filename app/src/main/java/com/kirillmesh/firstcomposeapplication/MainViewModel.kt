package com.kirillmesh.firstcomposeapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

    private val initialList = mutableListOf<InstagramProfileModel>().apply {
        repeat(500) {
            add(
                InstagramProfileModel(
                    id = it,
                    title = "Title: $it",
                    isFollowed = Random.nextBoolean()
                )
            )
        }
    }

    private val _models = MutableLiveData<List<InstagramProfileModel>>(initialList)
    val models: LiveData<List<InstagramProfileModel>> = _models


    fun changeFollowingStatus(model: InstagramProfileModel) {
        val modifiedList = _models.value?.toMutableList() ?: mutableListOf()
        modifiedList.replaceAll {
            if (it == model) {
                it.copy(isFollowed = !it.isFollowed)
            } else {
                it
            }
        }
        _models.value = modifiedList
    }

    fun removeItem(model: InstagramProfileModel) {
        val modifiedList = _models.value?.toMutableList() ?: mutableListOf()
        modifiedList.remove(model)
        _models.value = modifiedList
    }


//    private val _isFollow = MutableLiveData<Boolean>()
//    val isFollow: LiveData<Boolean> = _isFollow
//
//    fun changeFollowState(){
//        val wasFollow = _isFollow.value ?: false
//        _isFollow.value = !wasFollow
//    }
}