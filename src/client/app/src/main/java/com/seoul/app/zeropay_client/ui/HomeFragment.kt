package com.seoul.app.zeropay_client.ui


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager2.widget.ViewPager2
import com.google.zxing.integration.android.IntentIntegrator
import com.seoul.app.zeropay_client.AnyOrientationCaptureActivity
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.adapter.CardViewpagerAdapter
import com.seoul.app.zeropay_client.adapter.TransactionAdapter
import com.seoul.app.zeropay_client.model.UserMno
import com.seoul.app.zeropay_client.model.UserViewModel
import com.seoul.app.zeropay_client.network.response.UserCardResponse
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var userCardList: ArrayList<UserCardResponse?>
    private lateinit var viewModel: UserViewModel
    private lateinit var addCardAdapter : CardViewpagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewModel = ViewModelProviders.of(this)[UserViewModel::class.java]
        userCardList = ArrayList()

        val prefs = requireContext().getSharedPreferences("UserMno", Context.MODE_PRIVATE)
        val getMno = prefs.getInt("UserMno", 0)
        viewModel.getUserCardList(UserMno(getMno))

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val imageResources =
            arrayOf(R.drawable.banner1, R.drawable.banner2, R.drawable.banner3, R.drawable.banner4)

        viewModel.userCardList.observe(this, Observer {
                addCardAdapter.updateCard(it)
                card_total_position.text = (it.size).toString()
        })

        addCardAdapter = CardViewpagerAdapter(  {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container_frame, EnrollCardFragment())
                .addToBackStack(null)
                .commit()
        }, requireContext(), userCardList)
        //사용자 카드리스트
        add_card_viewpager.adapter = addCardAdapter

        add_card_viewpager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                if (position == addCardAdapter.itemCount ){
                    card_current_position.visibility = View.INVISIBLE
                    card_total_position.visibility = View.INVISIBLE
                    card_position_check.visibility = View.INVISIBLE
                }else{
                    card_current_position.visibility = View.VISIBLE
                    card_total_position.visibility = View.VISIBLE
                    card_position_check.visibility = View.VISIBLE
                    card_current_position.text = (position).toString()
                }
            }
        })

        //나의 거래
        transaction_recyclerView.apply {
            adapter = TransactionAdapter()
        }

        //setting carouselView
        carouselView.setImageListener { position, imageView ->
            imageView.scaleType = ImageView.ScaleType.FIT_XY
            imageView.setImageResource(imageResources[position])
        }
        carouselView.pageCount = imageResources.size

        //qr code scanner
        qr_button.setOnClickListener {
            val intentIntegrator = IntentIntegrator(requireActivity())
            intentIntegrator.captureActivity = AnyOrientationCaptureActivity::class.java
            intentIntegrator.initiateScan()
        }
    }
}
