package com.seoul.app.zeropay_client

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.seoul.app.zeropay_client.model.UserViewModel
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import com.seoul.app.zeropay_client.network.request.RegisterUserRequest
import com.seoul.app.zeropay_client.network.response.ServerResponse
import com.seoul.app.zeropay_client.ui.TransactionPWFragment
import kotlinx.android.synthetic.main.activity_register.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RegisterActivity : AppCompatActivity() {

    private lateinit var requestRegisterUser: RegisterUserRequest
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
            val id = id_edit_text.text.toString()
            val name = name_edit_text.text.toString()
            val pwd = password_edit_text.text.toString()
            val phone = phone_edit_text.text.toString()
            val payPwd = viewModel.payPwd.value.toString()
            val address = address_edit_text.text.toString()
            val email = email_edit_text.text.toString()

            if (id.isEmpty() || name.isEmpty() || pwd.isEmpty() || phone.isEmpty() || payPwd.isEmpty() || address.isEmpty() || email.isEmpty()) {
                Toast.makeText(applicationContext, "정보를 모두 입력해주세요.", Toast.LENGTH_SHORT).show()
            } else {
                requestRegisterUser = RegisterUserRequest(
                    id, name, pwd, phone, payPwd, address, email
                )

                userRequest.requestRegistration(requestRegisterUser)
                    .enqueue(object : Callback<ServerResponse<Any>> {
                        override fun onFailure(call: Call<ServerResponse<Any>>, t: Throwable) {
                            Log.e("register server fail", "" + t.toString())
                        }

                        override fun onResponse(
                            call: Call<ServerResponse<Any>>,
                            response: Response<ServerResponse<Any>>
                        ) {
                            if (response.isSuccessful) {
                                if (response.body() != null) {
                                    Log.e("register server Response -> ", "" + response.body())
                                    finish()
                                }
                            }
                        }
                    })
            }
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
