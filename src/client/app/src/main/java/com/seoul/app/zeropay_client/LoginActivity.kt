package com.seoul.app.zeropay_client

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.seoul.app.zeropay_client.network.UserApi
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var userNetWork: UserApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_button.setOnClickListener {
            startActivity<MainActivity>()
        }

        sign_up_button.setOnClickListener {
            startActivity<RegisterActivity>()
        }

/*        val loginRequest = LoginRequest("Test", "password")
        userNetWork.requestLogin(loginRequest).enqueue(object :
            Callback<ServerResponse> {
            override fun onFailure(call: Call<ServerResponse>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<ServerResponse>,
                response: Response<ServerResponse>
            ) {
                if (response.isSuccessful) {

                }
            }
        })*/
    }
}
