package com.seoul.app.zeropay_client.ui


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.databinding.FragmentTransactionPwBinding
import com.seoul.app.zeropay_client.model.TransactionViewModel


class TransactionPWFragment : Fragment() {
    private val PASSWORD_LENGTH = 4
    private val PASSWORD_KIND = 2
    private lateinit var binding: FragmentTransactionPwBinding
    private lateinit var viewModel: TransactionViewModel
    lateinit var view: ViewGroup
    private lateinit var checkPasswordList: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_transaction_pw, container, false)
        viewModel = ViewModelProviders.of(requireActivity()).get(TransactionViewModel::class.java)
        binding.lifecycleOwner = this
        binding.fragment = this
        view = binding.root as ViewGroup
        binding.tranViewModel = viewModel
        checkPasswordList = ArrayList()
        viewModel.initViewModels()
        return binding.root
    }

    fun pressTransactionPW(buttonState: Boolean, number: String) {
        Log.e("button pressed","success")
        viewModel.buttonState.value = buttonState
        viewModel.setPassword(number)
        val imageView = view.findViewWithTag<ImageView>(viewModel.transactionPasswordLength.value.toString())
        imageView.setImageResource(R.drawable.dot1_24dp)
    }

    fun deletePressed(buttonState: Boolean) {
        Log.e("delete pressed","success")
        viewModel.buttonState.value = buttonState
        viewModel.deletePassword()
        val imageView =
            view.findViewWithTag<ImageView>(viewModel.transactionPasswordLength.value?.plus(
                1
            ).toString())
        imageView.setImageResource(R.drawable.dot2_24dp)
    }

    private fun checkPassword(passwords: MutableList<String>): Boolean {
        if (passwords.size == PASSWORD_KIND) {
            return if (passwords[0] == passwords[1]) {
                true
            } else {
                passwords.removeAt(1)
                binding.transactionPwState.text = "비밀번호가 틀렸습니다."
                false
            }
        }
        return false
    }

    fun resetPassword() {
        Log.e("reset method","success")
        binding.transactionTitle.text = "재배열?"
        for (i in 1..PASSWORD_LENGTH) {
            val imageView = view.findViewWithTag<ImageView>(i.toString())
            imageView.setImageResource(R.drawable.dot2_24dp)
        }
        viewModel.transactionPassword.value?.let { checkPasswordList.add(it) }
        if (checkPassword(checkPasswordList)) {
            fragmentManager!!.beginTransaction().remove(this@TransactionPWFragment).commit()
            fragmentManager!!.popBackStack()
        }
        viewModel.initViewModels()
    }

}
