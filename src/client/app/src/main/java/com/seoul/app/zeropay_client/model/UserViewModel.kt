package com.seoul.app.zeropay_client.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class UserViewModel : ViewModel() {
    var transactionNumList = MutableLiveData<ArrayList<String>>()
    var transactionPassword = MutableLiveData<String>()
    var transactionPasswordLength = MutableLiveData<Int>()
    var payPwd = MutableLiveData<String>()
    var buttonState = MutableLiveData<Boolean>()
    private val list = ArrayList<String>()

    companion object {
        private const val PASSWORD_LENGTH = 4
    }

    init {
        transactionNumList.value = list
        transactionPassword.value = ""
        transactionPasswordLength.value = 0
    }

    fun initList() {
        for (i in 0..9) {
            list.add(i.toString())
        }
        list.shuffle()
    }

    fun initViewModels() {
        transactionPassword.value = ""
        transactionPasswordLength.value = 0
        buttonState.value = false
        shuffleList()
    }

    fun setPassword(clickedNumber: String) {
        if (transactionPasswordLength.value!! < PASSWORD_LENGTH && buttonState.value!!) {
            transactionPassword.value = transactionPassword.value + clickedNumber
            transactionPasswordLength.value = transactionPassword.value!!.length
        }
    }

    fun deletePassword() {
        if (transactionPasswordLength.value!! > 0 && (!buttonState.value!!)) {
            transactionPassword.value = transactionPassword.value!!.substring(
                0,
                transactionPassword.value!!.length - 1
            )
            transactionPasswordLength.value = transactionPassword.value!!.length
        }
    }

    fun shuffleList() {
        list.shuffle()
        transactionNumList.value = list
    }
}