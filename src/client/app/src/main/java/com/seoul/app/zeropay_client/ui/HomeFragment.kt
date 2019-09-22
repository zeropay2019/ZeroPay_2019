package com.seoul.app.zeropay_client.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.google.zxing.integration.android.IntentIntegrator
import com.seoul.app.zeropay_client.AnyOrientationCaptureActivity
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.adapter.CardViewpagerAdapter
import com.seoul.app.zeropay_client.adapter.TransactionAdapter
import com.seoul.app.zeropay_client.model.UserViewModel
import com.seoul.app.zeropay_client.network.response.UserCardResponse
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var userCardList: ArrayList<UserCardResponse?>
    private lateinit var viewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewModel = ViewModelProviders.of(this)[UserViewModel::class.java]
        viewModel.getUserCardList(0)
        if (viewModel.userCardList.value != null) {
            userCardList = viewModel.userCardList.value!!
        }
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val imageResources =
            arrayOf(R.drawable.banner1, R.drawable.banner2, R.drawable.banner3, R.drawable.banner4)
        viewModel = ViewModelProviders.of(requireActivity()).get(UserViewModel::class.java)

        val addCardAdapter = CardViewpagerAdapter {
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.container_frame, EnrollCardFragment())
                .addToBackStack(null)
                .commit()
        }

        add_card_viewpager.adapter = addCardAdapter

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
