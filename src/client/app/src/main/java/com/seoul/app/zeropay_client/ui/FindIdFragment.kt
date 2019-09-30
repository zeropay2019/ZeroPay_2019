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
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import com.seoul.app.zeropay_client.network.request.SearchIdRequest
import com.seoul.app.zeropay_client.network.response.FindIdResponse
import com.seoul.app.zeropay_client.network.response.ServerResponse
import kotlinx.android.synthetic.main.fragment_find_id.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class FindIdFragment : Fragment() {

    private lateinit var userNetWork: UserApi
    private lateinit var searchIdRequest: SearchIdRequest

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        userNetWork = UserRepository.getInstance()
        return inflater.inflate(com.seoul.app.zeropay_client.R.layout.fragment_find_id, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        find_id_inputName_editText.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                if ((event?.action == KeyEvent.ACTION_DOWN) && keyCode == KeyEvent.KEYCODE_ENTER) {
                    find_id_inputPhone_editText.requestFocus()
                    return true
                }
                return false
            }
        })

        find_id_inputPhone_editText.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                if ((event?.action == KeyEvent.ACTION_DOWN) && keyCode == KeyEvent.KEYCODE_ENTER) {
                    find_id_action_button.requestFocus()
                    val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(view.windowToken, 0)
                    return true
                }
                return false
            }
        })

        find_id_action_button.setOnClickListener {
            val inputName = find_id_inputName_editText.text.toString()
            val inputPhone = find_id_inputPhone_editText.text.toString()

            if (inputName.isEmpty() || inputPhone.isEmpty()) {
                Toast.makeText(requireContext(), "정보를 모두 입력해주세요.", Toast.LENGTH_SHORT).show()
            } else {
                searchIdRequest = SearchIdRequest(inputName, inputPhone)
                userNetWork.searchId(searchIdRequest).enqueue(object :
                    Callback<ServerResponse<FindIdResponse>> {
                    override fun onFailure(
                        call: Call<ServerResponse<FindIdResponse>>,
                        t: Throwable
                    ) {
                        Log.e("Find id Failure", "" + t.toString())
                    }

                    override fun onResponse(
                        call: Call<ServerResponse<FindIdResponse>>,
                        response: Response<ServerResponse<FindIdResponse>>
                    ) {
                        if (response.isSuccessful) {
                            if (response.body() != null) {
                                if (response.body()!!.resultCode == 102) {
                                    findId_result_textView.text = response.body()!!.message
                                    findId_result_textView.visibility = View.VISIBLE
                                } else {
                                    findId_result_textView.text = response.body()!!.param?.userId
                                    findId_result_textView.visibility = View.VISIBLE
                                }
                            }
                        }
                    }
                })
            }
        }
    }


}
