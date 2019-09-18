package com.seoul.app.zeropay_client.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.model.UserViewModel
import com.seoul.app.zeropay_client.network.UserApi
import com.seoul.app.zeropay_client.network.UserRepository
import com.seoul.app.zeropay_client.network.request.EnrollCardRequest
import kotlinx.android.synthetic.main.fragment_enroll_card.*


class EnrollCardFragment : Fragment() {

    private lateinit var userNetWork: UserApi
    private lateinit var enrollCardRequest: EnrollCardRequest
    private lateinit var viewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        userNetWork = UserRepository.getInstance()
        return inflater.inflate(R.layout.fragment_enroll_card, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this)[UserViewModel::class.java]

        val bankArray = resources.getStringArray(R.array.bank)
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

            if (validCardNum(numArray.joinToString())){
                enrollCardRequest = EnrollCardRequest(
                    0,
                    numArray.joinToString(""),
                    card_nickName_edit_text.text.toString(),
                    bank_spinner.selectedItem.toString()
                )
                viewModel.registerUserCard(enrollCardRequest)
            }else{
                Toast.makeText(requireContext(), "카드번호를 모두 입력해주세요", Toast.LENGTH_SHORT).show()
            }
        }
    }

    //valid fun
    private fun validCardNum(targetNumber: String): Boolean{
        return targetNumber.length > 15
    }

}
