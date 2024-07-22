package com.example.lifecycleactivity

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nextBtn  = findViewById<Button>(R.id.nextbtn)
        nextBtn.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.e(ContentValues.TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(ContentValues.TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(ContentValues.TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(ContentValues.TAG,"onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(ContentValues.TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(ContentValues.TAG,"onDestroy")

    }
}