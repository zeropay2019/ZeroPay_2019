package com.seoul.app.zeropay_client

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.seoul.app.zeropay_client.ui.HomeFragment
import com.seoul.app.zeropay_client.ui.InfoFragment
import com.seoul.app.zeropay_client.ui.MapFragment
import com.seoul.app.zeropay_client.ui.SettingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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
}
