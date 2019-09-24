package com.seoul.app.zeropay_client

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var userNetWork: UserApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        userNetWork = UserRepository.getInstance()

        login_button.setOnClickListener {
            /*val loginRequest = LoginRequest(id_edit_text.text.toString(), password_edit_text.text.toString())
            userNetWork.requestLogin(loginRequest).enqueue(object :
                Callback<ServerResponse<LoginResponse>> {
                override fun onFailure(call: Call<ServerResponse<LoginResponse>>, t: Throwable) {
                    Log.e("Login response Fail-> ",""+t.toString())
                }

                override fun onResponse(
                    call: Call<ServerResponse<LoginResponse>>,
                    response: Response<ServerResponse<LoginResponse>>
                ) {
                    if (response.isSuccessful) {
                        if (response.body() != null){
                            if (response.body()!!.resultCode == 0){
                                startActivity<MainActivity>()
                            }else{
                                Toast.makeText(applicationContext, "아이디 혹은 비밀번호를 확인해주세요",Toast.LENGTH_SHORT).show()
                            }
                            Log.e("Login response",""+response.body())

                        }
                    }
                }
            })*/
            startActivity<MainActivity>()
        }

        sign_up_button.setOnClickListener {
            startActivity<RegisterActivity>()
        }

    }
}
