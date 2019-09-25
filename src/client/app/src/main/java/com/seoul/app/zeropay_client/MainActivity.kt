package com.seoul.app.zeropay_client

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.integration.android.IntentIntegrator
import com.journeyapps.barcodescanner.DecoratedBarcodeView
import com.seoul.app.zeropay_client.ui.HomeFragment
import com.seoul.app.zeropay_client.ui.InfoFragment
import com.seoul.app.zeropay_client.ui.MapFragment
import com.seoul.app.zeropay_client.ui.SettingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , DecoratedBarcodeView.TorchListener {
    override fun onTorchOn() {

    }

    override fun onTorchOff() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container_frame, fragment, fragment.javaClass.getSimpleName())
            .commit()

        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.action_first -> {
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.container_frame, homeFragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_second -> {
                    val mapFragment = MapFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.container_frame, mapFragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_third -> {
                    val infoFragment = InfoFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.container_frame, infoFragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_fourth -> {
                    val settingFragment = SettingFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.container_frame, settingFragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == IntentIntegrator.REQUEST_CODE) {
            val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
            if (result == null) {
                Toast.makeText(this, "데이터가 없습니다.", Toast.LENGTH_SHORT).show()
            } else {
                Log.e("scan Url-> ", "" + result.contents)
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

    override fun onPause() {
        super.onPause()

    }
}
