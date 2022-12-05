package com.example.androidlab3_2

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId


private fun openAboutViaBottomNav() {
    onView(withId(R.id.bnToAboutActivity)).perform(click())
}

fun openAbout() = openAboutViaBottomNav()
