package com.seoul.app.zeropay_client

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import com.seoul.app.zeropay_client.network.request.LoginRequest
import com.seoul.app.zeropay_client.network.response.ServerResponse
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {

    private lateinit var userNetWork: UserApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        userNetWork = UserRepository.getInstance()

        login_button.setOnClickListener {
            val loginRequest = LoginRequest(id_edit_text.text.toString(), password_edit_text.text.toString())
            userNetWork.requestLogin(loginRequest).enqueue(object :
                Callback<ServerResponse> {
                override fun onFailure(call: Call<ServerResponse>, t: Throwable) {

                }

                override fun onResponse(
                    call: Call<ServerResponse>,
                    response: Response<ServerResponse>
                ) {
                    if (response.isSuccessful) {
                        if (response.body() != null){
                            Log.e("Login response",""+response.body())
                            startActivity<MainActivity>()
                        }
                    }
                }
            })
        }

        sign_up_button.setOnClickListener {
            startActivity<RegisterActivity>()
        }

    }
}
