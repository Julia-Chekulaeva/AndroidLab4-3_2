package com.example.androidlab3_2

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.androidlab3_2.databinding.ActivitySecondBinding

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        binding.bnToFirst.setOnClickListener { toActivity1() }
        binding.bnToThird.setOnClickListener { toActivity3() }
        binding.navView.setOnItemSelectedListener { toAboutActivity(it) }
        setContentView(binding.root)
    }

    private fun toActivity1() {
        startActivity(Intent(this, MainActivity::class.java).setFlags(
            FLAG_ACTIVITY_CLEAR_TOP))
    }

    private fun toActivity3() {
        startActivity(Intent(this, Activity3::class.java))
    }

    private fun toAboutActivity(menuItem: MenuItem) : Boolean {
        when (menuItem.itemId) {
            R.id.ic_info -> {
                startActivity(Intent(this, ActivityAbout::class.java))
            }
        }
        return false
    }
}