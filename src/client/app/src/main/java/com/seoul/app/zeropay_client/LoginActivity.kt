package com.seoul.app.zeropay_client

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.seoul.app.zeropay_client.model.UserViewModel
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import com.seoul.app.zeropay_client.network.request.LoginRequest
import com.seoul.app.zeropay_client.network.response.LoginResponse
import com.seoul.app.zeropay_client.network.response.ServerResponse
import com.seoul.app.zeropay_client.ui.FindIdFragment
import com.seoul.app.zeropay_client.ui.FindPWFragment
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {

    private lateinit var userNetWork: UserApi
    private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        viewModel = ViewModelProviders.of(this)[UserViewModel::class.java]
        userNetWork = UserRepository.getInstance()

        login_button.setOnClickListener {
            val loginRequest = LoginRequest(id_edit_text.text.toString(), password_edit_text.text.toString())
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
                                viewModel.userMno.value = response.body()!!.param?.mno
                                finish()
                                startActivity<MainActivity>("mno" to response.body()!!.param?.mno)
                            }else{
                                Toast.makeText(applicationContext, "아이디 혹은 비밀번호를 확인해주세요",Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                }
            })
        }

        sign_up_button.setOnClickListener {
            startActivity<RegisterActivity>()
        }

        findId_button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.login_container, FindIdFragment()).addToBackStack(null).commit()
        }

        findPassword_button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.login_container, FindPWFragment()).addToBackStack(null).commit()
        }

    }
}
