package com.seoul.app.zeropay_client.model

import android.util.Log
import androidx.lifecycle.ViewModel
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import com.seoul.app.zeropay_client.network.request.ShopListRequest
import com.seoul.app.zeropay_client.network.response.ServerResponse
import com.seoul.app.zeropay_client.network.response.ShopListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MapViewModel : ViewModel(){
    private var userNetWork: UserApi = UserRepository.getInstance()
    var responseShopList = ArrayList<ShopListResponse>()

    fun getShopList(shopListRequest: ShopListRequest){
        userNetWork.getShopList(shopListRequest).enqueue(object: Callback<ServerResponse<ArrayList<ShopListResponse>>>{
            override fun onFailure(
                call: Call<ServerResponse<ArrayList<ShopListResponse>>>,
                t: Throwable
            ) {
                Log.e("Get Shop List Fail",""+t.toString())
            }

            override fun onResponse(
                call: Call<ServerResponse<ArrayList<ShopListResponse>>>,
                response: Response<ServerResponse<ArrayList<ShopListResponse>>>
            ) {
                if (response.isSuccessful){
                    if (response.body() != null){
                        responseShopList = response.body()?.param!!
                    }
                }
                Log.e("Get Shop List Success ",""+response.body().toString())
            }

        })
    }
}