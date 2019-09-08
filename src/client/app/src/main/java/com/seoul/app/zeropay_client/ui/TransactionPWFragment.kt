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
    private lateinit var PWViewModel: UserViewModel
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
        //TODO:코드리팩토링해야됨
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_transaction_pw, container, false)
        PWViewModel = ViewModelProviders.of(requireActivity()).get(UserViewModel::class.java)
        binding.lifecycleOwner = this
        binding.fragment = this
        view = binding.root as ViewGroup
        binding.tranViewModel = PWViewModel
        checkPasswordList = ArrayList()
        PWViewModel.initList()
        return binding.root
    }

    fun pressTransactionPW(buttonState: Boolean, number: String) {
        PWViewModel.buttonState.value = buttonState
        PWViewModel.setPassword(number)
        val imageView =
            view.findViewWithTag<ImageView>(PWViewModel.transactionPasswordLength.value.toString())
        imageView.setImageResource(R.drawable.dot1_24dp)
        if (PWViewModel.transactionPasswordLength.value == PASSWORD_LENGTH) {
            resetPassword()
        }
    }

    fun deletePressed(buttonState: Boolean) {
        PWViewModel.buttonState.value = buttonState
        PWViewModel.deletePassword()
        val imageView =
            view.findViewWithTag<ImageView>(
                PWViewModel.transactionPasswordLength.value?.plus(
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
        //checkPasswordList.add(viewModel.transactionPassword.getValue());

        PWViewModel.transactionPassword.value?.let { checkPasswordList.add(it) }
        if (checkPassword(checkPasswordList)) {
            PWViewModel.payPwd.value = PWViewModel.transactionPassword.value
            fragmentManager!!.beginTransaction().remove(this@TransactionPWFragment).commit()
            fragmentManager!!.popBackStack()
        }
        PWViewModel.initViewModels()
    }
}
