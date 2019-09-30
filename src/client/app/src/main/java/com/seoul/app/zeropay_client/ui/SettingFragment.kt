package com.seoul.app.zeropay_client.ui

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.seoul.app.zeropay_client.R


class SettingFragment : PreferenceFragmentCompat(){
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.setting_preference, rootKey)
    }
}
