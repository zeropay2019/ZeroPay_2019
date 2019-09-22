package com.seoul.app.zeropay_client.model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import com.seoul.app.zeropay_client.network.request.EnrollCardRequest
import com.seoul.app.zeropay_client.network.response.ServerResponse
import com.seoul.app.zeropay_client.network.response.UserCardResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserViewModel : ViewModel() {
    var transactionNumList = MutableLiveData<ArrayList<String>>()
    var transactionPassword = MutableLiveData<String>()
    var transactionPasswordLength = MutableLiveData<Int>()
    var payPwd = MutableLiveData<String>()
    var buttonState = MutableLiveData<Boolean>()
    private val list = ArrayList<String>()
    private var userNetWork: UserApi
    var userCardList = MutableLiveData<ArrayList<UserCardResponse?>>()

    companion object {
        private const val PASSWORD_LENGTH = 4
    }

    init {
        transactionNumList.value = list
        transactionPassword.value = ""
        transactionPasswordLength.value = 0
        userNetWork = UserRepository.getInstance()
        userCardList.value = ArrayList()
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

    //사용자 카드등록
    fun registerUserCard(enrollCardRequest: EnrollCardRequest) {
        userNetWork.enrollCard(enrollCardRequest).enqueue(object : Callback<ServerResponse<Any>> {
            override fun onFailure(call: Call<ServerResponse<Any>>, t: Throwable) {
                Log.e("Register User Card Fail ", "" + t.toString())
            }

            override fun onResponse(
                call: Call<ServerResponse<Any>>,
                response: Response<ServerResponse<Any>>
            ) {
                Log.e("Register user Card Success ",""+response.body().toString())
            }
        })
    }

    //사용자 카드목록 조회
    fun getUserCardList(mno: Int) {
        userNetWork.getCard(mno)
            .enqueue(object : Callback<ServerResponse<ArrayList<UserCardResponse?>>> {
                override fun onFailure(
                    call: Call<ServerResponse<ArrayList<UserCardResponse?>>>,
                    t: Throwable
                ) {
                    Log.e("Get User CardList Fail-> ",t.toString())
                }

                override fun onResponse(
                    call: Call<ServerResponse<ArrayList<UserCardResponse?>>>,
                    response: Response<ServerResponse<ArrayList<UserCardResponse?>>>
                ) {
                    if (response.isSuccessful){
                        if (response.body() != null) userCardList.value = response.body()?.param
                    }
                }
            })
    }

}