package com.seoul.app.zeropay_client.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.adapter.CardViewpagerAdapter
import com.seoul.app.zeropay_client.adapter.TransactionAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var imageResources = arrayOf(R.drawable.banner1, R.drawable.banner2, R.drawable.banner3, R.drawable.banner4)
        val adapter = CardViewpagerAdapter()
        add_card_viewpager.adapter = adapter

        val transaction_adapter = TransactionAdapter()
        transaction_recyclerView.adapter = transaction_adapter

        carouselView.pageCount = 4

        carouselView.setImageListener { position, imageView ->
            imageView.scaleType = ImageView.ScaleType.FIT_START
            imageView.setImageResource(imageResources[position])
        }
    }

}
