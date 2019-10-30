package com.seoul.app.zeropay_client.ui

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.runner.AndroidJUnit4
import com.seoul.app.zeropay_client.R
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class EnrollCardFragmentTest {
    @Test fun testEventFragment() {
        val scenario = launchFragmentInContainer<EnrollCardFragment>()
        onView(withId(R.id.card_registration_button))
            .perform(click())
    }
}