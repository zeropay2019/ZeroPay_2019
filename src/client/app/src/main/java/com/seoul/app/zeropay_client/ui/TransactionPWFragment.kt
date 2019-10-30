package com.seoul.app.zeropay_client.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.databinding.FragmentTransactionPwBinding
import com.seoul.app.zeropay_client.model.UserViewModel


class TransactionPWFragment : Fragment() {
    private lateinit var binding: FragmentTransactionPwBinding
    private lateinit var userPasswordViewModel: UserViewModel
    lateinit var view: ViewGroup
    private lateinit var checkPasswordList: ArrayList<String>

    companion object {
        private const val PASSWORD_LENGTH = 4
        private const val PASSWORD_KIND = 2
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_transaction_pw, container, false)
        userPasswordViewModel = ViewModelProviders.of(requireActivity()).get(UserViewModel::class.java)
        binding.lifecycleOwner = this
        binding.fragment = this
        view = binding.root as ViewGroup
        binding.tranViewModel = userPasswordViewModel
        checkPasswordList = ArrayList()
        userPasswordViewModel.initList()
        return binding.root
    }

    fun pressTransactionPW(buttonState: Boolean, number: String) {
        userPasswordViewModel.buttonState.value = buttonState
        userPasswordViewModel.setPassword(number)
        val imageView =
            view.findViewWithTag<ImageView>(userPasswordViewModel.transactionPasswordLength.value.toString())
        imageView.setImageResource(R.drawable.dot1_24dp)
        if (userPasswordViewModel.transactionPasswordLength.value == PASSWORD_LENGTH) {
            resetPassword()
        }
    }

    fun deletePressed(buttonState: Boolean) {
        userPasswordViewModel.buttonState.value = buttonState
        userPasswordViewModel.deletePassword()
        val imageView =
            view.findViewWithTag<ImageView>(
                userPasswordViewModel.transactionPasswordLength.value?.plus(
                    1
                ).toString()
            )
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

    private fun resetPassword() {
        binding.transactionTitle.text = "비밀번호 확인"
        for (i in 1..PASSWORD_LENGTH) {
            val imageView = view.findViewWithTag<ImageView>(i.toString())
            imageView.setImageResource(R.drawable.dot2_24dp)
        }

        userPasswordViewModel.transactionPassword.value?.let { checkPasswordList.add(it) }
        if (checkPassword(checkPasswordList)) {
            userPasswordViewModel.payPwd.value = userPasswordViewModel.transactionPassword.value
            fragmentManager!!.beginTransaction().remove(this@TransactionPWFragment).commit()
            fragmentManager!!.popBackStack()
        }
        userPasswordViewModel.initViewModels()
    }
}
