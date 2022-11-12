package com.example.virus

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.virus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var handler: Handler
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mediaPlayer =MediaPlayer.create(this , R.raw.mp3)
        mediaPlayer.start()
        handler = Handler(Looper.getMainLooper()!!)
        handler.postDelayed(runnable , 100)
    }
    //    var progressInt = 0
    private val runnable =object :Runnable{
        override fun run() {
//binding.myProgressBar.progress = progressInt
//            binding.tvProgress.text = progressInt.toString()
            handler.postDelayed(this ,100)
            finish()
            startActivity(Intent(this@MainActivity, MainActivity::class.java ))
        }

    }

    override fun onBackPressed() {

    }
}