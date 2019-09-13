package com.seoul.app.zeropay_client.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.seoul.app.zeropay_client.R
import kotlinx.android.synthetic.main.fragment_enroll_card.*


class EnrollCardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_enroll_card, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bankArray = resources.getStringArray(R.array.bank)
        val adapter = ArrayAdapter(
            requireActivity(),
            android.R.layout.simple_spinner_dropdown_item,
            bankArray
        )
        bank_spinner.adapter = adapter
//        inputCardLayout.bankSpinner.setAdapter(adapter)
    }

}
