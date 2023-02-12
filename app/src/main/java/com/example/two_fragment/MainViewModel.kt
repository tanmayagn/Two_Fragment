package com.example.two_fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var liveUserDetails = MutableLiveData<UserDetails>()

    fun setNewUserDetails(newUserDetails: UserDetails){
        liveUserDetails.value = newUserDetails
    }

}