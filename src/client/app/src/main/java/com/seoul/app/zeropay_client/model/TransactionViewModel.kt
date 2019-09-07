package com.seoul.app.zeropay_client.model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class TransactionViewModel: ViewModel(){
    private val PASSWORD_LENGTH = 4
    var transactionNumList = MutableLiveData<ArrayList<String>>()
    var transactionPassword = MutableLiveData<String>()
    var transactionPasswordLength = MutableLiveData<Int>()
    var buttonState = MutableLiveData<Boolean>()
    var serverChecker = MutableLiveData<Boolean>()
    var recycleFragment = MutableLiveData<Boolean>()
    var transactionResultMessage = MutableLiveData<String>()
    var transactionResult = MutableLiveData<Boolean>()

    private val list = ArrayList<String>()

//    fun TransactionViewModel() {
//        for (i in 0..9) {
//            list.add(i.toString())
//        }
//        list.shuffle()
//        transactionNumList.value = list
//        transactionPassword.value = ""
//        transactionPasswordLength.setValue(0)
//        buttonState.value = false
//        serverChecker.value = false
//        recycleFragment.value = false
//        transactionResult.value = false
//    }


    fun initTransaction() {
        transactionPassword.value = ""
        transactionPasswordLength.value = 0
        transactionResultMessage.value = ""
        transactionResult.value = false
    }

    fun failTransactionInit() {
        transactionPassword.value = ""
        transactionPasswordLength.value = 0
    }

    fun initViewModels() {
        for (i in 0..9) {
            list.add(i.toString())
        }
        list.shuffle()
        transactionNumList.value = list
        transactionPassword.value = ""
        transactionPasswordLength.value = 0
        buttonState.value = false
        serverChecker.value = false
        recycleFragment.value = false
        transactionResult.value = false
        transactionPassword.value = ""
        transactionPasswordLength.value = 0
        buttonState.value = false
        shuffleList()
    }

    fun setPassword(clickedNumber: String) {
        Log.e("setpassword","dfdfdfdfdfdf")
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

    private fun shuffleList() {
        list.shuffle()
        transactionNumList.value = list
    }
}