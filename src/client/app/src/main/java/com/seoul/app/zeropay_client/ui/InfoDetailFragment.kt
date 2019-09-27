package com.seoul.app.zeropay_client.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.model.Info
import kotlinx.android.synthetic.main.fragment_info_detail.*

class InfoDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val detailInfo = arguments?.getSerializable("info")
        info_detail_contents.text = (detailInfo as Info).contents
        info_detail_title.text = detailInfo.title
    }
}
