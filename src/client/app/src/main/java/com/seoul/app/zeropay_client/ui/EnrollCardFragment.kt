package com.seoul.app.zeropay_client.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.seoul.app.zeropay_client.model.UserViewModel
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import com.seoul.app.zeropay_client.network.request.EnrollCardRequest
import kotlinx.android.synthetic.main.fragment_enroll_card.*




class EnrollCardFragment : Fragment() {

    private lateinit var userNetWork: UserApi
    private lateinit var enrollCardRequest: EnrollCardRequest
    private lateinit var viewModel: UserViewModel
    private lateinit var stringBuilder: StringBuilder

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        userNetWork = UserRepository.getInstance()
        activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        return inflater.inflate(com.seoul.app.zeropay_client.R.layout.fragment_enroll_card, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this)[UserViewModel::class.java]

        val bankArray = resources.getStringArray(com.seoul.app.zeropay_client.R.array.bank)
        val spinnerAdapter = ArrayAdapter(
            requireActivity(),
            android.R.layout.simple_spinner_dropdown_item,
            bankArray
        )
        bank_spinner.apply {
            adapter = spinnerAdapter
        }

        card_registration_button.setOnClickListener {
            val numArray = arrayOf(
                cardNum_edit_1.text.toString(),
                cardNum_edit_2.text.toString(),
                cardNum_edit_3.text.toString(),
                cardNum_edit_4.text.toString()
            )

            val inputCardNum = makeCardNumber(numArray)
            if (validCardNum(inputCardNum)){
                enrollCardRequest = EnrollCardRequest(
                    10,
                    inputCardNum,
                    card_nickName_edit_text.text.toString(),
                    bank_spinner.selectedItem.toString()
                )
                viewModel.registerUserCard(enrollCardRequest)
                Toast.makeText(requireContext(), "카드가 성공적으로 등록되었습니다.", Toast.LENGTH_SHORT).show()
                fragmentManager?.beginTransaction()?.remove(this)?.commit()
            }else{
                Toast.makeText(requireContext(), "카드번호를 모두 입력해주세요", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validCardNum(targetNumber: String): Boolean{
        return targetNumber.length > 15
    }

    private fun makeCardNumber(numArr: Array<String>): String{
        stringBuilder = StringBuilder()
        for (i in numArr){
            stringBuilder.append(i)
        }
        return stringBuilder.toString()
    }

}
