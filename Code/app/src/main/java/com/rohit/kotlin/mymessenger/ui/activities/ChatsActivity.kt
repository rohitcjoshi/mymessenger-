package com.rohit.kotlin.mymessenger.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rohit.kotlin.mymessenger.R

class ChatsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chats)
        supportActionBar!!.title = "Messages"
    }
}