package com.seoul.app.zeropay_client

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.seoul.app.zeropay_client.model.UserViewModel
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import com.seoul.app.zeropay_client.network.request.RegisterRequest
import com.seoul.app.zeropay_client.network.response.ServerResponse
import com.seoul.app.zeropay_client.ui.TransactionPWFragment
import kotlinx.android.synthetic.main.activity_register.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RegisterActivity : AppCompatActivity() {

    private lateinit var requestRegister: RegisterRequest
    private lateinit var userRequest: UserApi
    private lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        userRequest = UserRepository.getInstance()
        viewModel = ViewModelProviders.of(this)[UserViewModel::class.java]

        register_cancel_button.setOnClickListener {
            finish()
        }

        viewModel.payPwd.observe(this, Observer { payPwd ->
            if (payPwd != null) {
                transaction_password_button.text = "설정 완료"
                transaction_password_button.setBackgroundColor(Color.rgb(33, 35, 126))
                transaction_password_button.isEnabled = false
            }
        })

        register_complete_button.setOnClickListener {

            requestRegister = RegisterRequest(
                id = id_edit_text.text.toString(),
                name = name_edit_text.text.toString(),
                pwd = password_edit_text.text.toString(),
                phone = phone_edit_text.text.toString(),
                payPwd = viewModel.payPwd.value.toString(),
                address = address_edit_text.text.toString(),
                email = email_edit_text.text.toString()
            )

            userRequest.requestRegist(requestRegister).enqueue(object : Callback<ServerResponse> {
                override fun onFailure(call: Call<ServerResponse>, t: Throwable) {
                    Log.e("register server fail", "" + t.toString())
                }

                override fun onResponse(
                    call: Call<ServerResponse>,
                    response: Response<ServerResponse>
                ) {
                    if (response.isSuccessful) {
                        if (response.body() != null) {
                            Log.e("register server Response -> ", "" + response.body())
                        }
                    }
                }
            })
        }

        transaction_password_button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container_view, TransactionPWFragment())
                .addToBackStack(null)
                .commit()
        }
    }

    private fun isSignUpValid(text: Editable?): Boolean {
        return text != null && text.length > 0
    }
}
