package com.example.app_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.app_bar.databinding.ActivityAlterBinding
import com.example.app_bar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class AlterActivity : AppCompatActivity() {
    private lateinit var b: ActivityAlterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAlterBinding.inflate(layoutInflater)
        setContentView(b.root)
        actionBar?.setHomeButtonEnabled(true)
    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            super.onCreateOptionsMenu(menu)
            menuInflater.inflate(R.menu.main_menu, menu)
            // para meter mi menu, que he creado, en este caso main_menu

            return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.itemId) {
            R.id.e_Home -> {
                Snackbar.make(b.root, "Volviendo", Snackbar.LENGTH_LONG).show()
                return true
            }

        }
        return false

    }
}