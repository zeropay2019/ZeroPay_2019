package com.seoul.app.zeropay_client.ui

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import com.seoul.app.zeropay_client.R


class SettingFragment : PreferenceFragmentCompat(){
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.setting_preference, rootKey)

        val sps = PreferenceManager.getDefaultSharedPreferences(requireContext())
        val addShortcut = sps.getBoolean("key_add_shortcut", false)
        val screenOn = sps.getBoolean("key_switch_on", false)
        val editName = sps.getString("key_edit_name", "")
    }
}
