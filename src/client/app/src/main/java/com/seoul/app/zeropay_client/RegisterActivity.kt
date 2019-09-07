package com.seoul.app.zeropay_client

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
    }
}
