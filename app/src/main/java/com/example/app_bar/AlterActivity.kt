package com.example.app_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_bar.databinding.ActivityAlterBinding
import com.example.app_bar.databinding.ActivityMainBinding

class AlterActivity : AppCompatActivity() {
    private lateinit var b: ActivityAlterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAlterBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
}