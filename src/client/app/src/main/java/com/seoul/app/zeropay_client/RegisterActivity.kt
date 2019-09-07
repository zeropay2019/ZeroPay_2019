package com.seoul.app.zeropay_client

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.seoul.app.zeropay_client.ui.TransactionPWFragment
import kotlinx.android.synthetic.main.activity_register.*



class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        register_cancel_button.setOnClickListener {
            finish()
        }

        register_complete_button.setOnClickListener {
            finish()
        }

        transaction_password_button.setOnClickListener {
            Log.e("dd","ddfaf")
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container_view, TransactionPWFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}
