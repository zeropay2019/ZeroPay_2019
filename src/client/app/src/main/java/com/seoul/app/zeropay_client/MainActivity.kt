package com.seoul.app.zeropay_client

import android.content.Context
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

    private var backPressedTime:Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userMno = intent.getIntExtra("mno",0)
        val prefs = applicationContext.getSharedPreferences("UserMno", Context.MODE_PRIVATE)
        val editor = prefs!!.edit()
        editor.putInt("UserMno", userMno).apply()

        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container_frame, homeFragment)
            .commit()

        val mapFragment = MapFragment()
        val infoFragment = InfoFragment()
        val settingFragment = SettingFragment()


        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.action_first -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container_frame, homeFragment)
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_second -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container_frame, mapFragment)
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_third -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container_frame, infoFragment)
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_fourth -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container_frame, settingFragment)
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

    override fun onBackPressed() {
        val tempTime: Long = System.currentTimeMillis()
        val intervalTime = tempTime - backPressedTime

        if (intervalTime in 0..2000){
            super.onBackPressed()
        }else{
            backPressedTime = tempTime
            Toast.makeText(applicationContext, "앱을 종료하려면 한번 더 눌러주세요", Toast.LENGTH_SHORT).show()
        }

    }
}
