package com.seoul.app.zeropay_client.ui


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import com.seoul.app.zeropay_client.network.request.SearchPwRequest
import com.seoul.app.zeropay_client.network.response.ServerResponse
import com.seoul.app.zeropay_client.network.response.UserPWResponse
import kotlinx.android.synthetic.main.fragment_find_pw.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FindPWFragment : Fragment() {

    private lateinit var userNetWork: UserApi
    private lateinit var searchPwRequest: SearchPwRequest
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        userNetWork = UserRepository.getInstance()
        return inflater.inflate(R.layout.fragment_find_pw, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        find_pw_inputId.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                if ((event?.action == KeyEvent.ACTION_DOWN) && keyCode == KeyEvent.KEYCODE_ENTER) {
                    find_pw_inputName.requestFocus()
                    return true
                }
                return false
            }
        })

        find_pw_inputName.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                if ((event?.action == KeyEvent.ACTION_DOWN) && keyCode == KeyEvent.KEYCODE_ENTER) {
                    find_pw_inputPhone.requestFocus()
                    return true
                }
                return false
            }
        })

        find_pw_inputPhone.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                if ((event?.action == KeyEvent.ACTION_DOWN) && keyCode == KeyEvent.KEYCODE_ENTER) {
                    find_pw_action_button.requestFocus()
                    val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(view.windowToken, 0)
                    return true
                }
                return false
            }
        })

        find_pw_action_button.setOnClickListener {
            val inputId = find_pw_inputId.text.toString()
            val inputName = find_pw_inputName.text.toString()
            val inputPhone = find_pw_inputPhone.text.toString()

            if (inputId.isEmpty() || inputName.isEmpty() || inputPhone.isEmpty() ){
                Toast.makeText(requireContext(), "정보를 모두 입력해주세요.", Toast.LENGTH_SHORT).show()
            }else{
                searchPwRequest = SearchPwRequest(inputId,inputName,inputPhone)
                userNetWork.searchPw(searchPwRequest).enqueue(object:
                    Callback<ServerResponse<UserPWResponse>>{
                    override fun onFailure(
                        call: Call<ServerResponse<UserPWResponse>>,
                        t: Throwable
                    ) {
                        Log.e("Find user PW failure-> ",""+t.toString())
                    }

                    override fun onResponse(
                        call: Call<ServerResponse<UserPWResponse>>,
                        response: Response<ServerResponse<UserPWResponse>>
                    ) {
                        if (response.isSuccessful){
                            Log.e("Find user PW Success-> ",""+response.body().toString())
                            if (response.body() != null){
                                if (response.body()!!.resultCode == 103){
                                    findPW_result_textView.text = response.body()!!.message
                                    findPW_result_textView.visibility = View.VISIBLE
                                }else{
                                    findPW_result_textView.text = response.body()!!.param.toString()
                                    findPW_result_textView.visibility = View.VISIBLE
                                }
                            }
                        }
                    }

                })
            }
        }
    }


}
