package com.example.app_bar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.app.NavUtils
import com.example.app_bar.databinding.ActivityAlterBinding
import com.example.app_bar.databinding.ActivityFormuBinding
import com.example.app_bar.databinding.ActivityMainBinding

class FormuActivity : AppCompatActivity() {
    private lateinit var b: ActivityFormuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityFormuBinding.inflate(layoutInflater)
        setContentView(b.root)

        actionBar?.setHomeButtonEnabled(true)

        val actionBar = supportActionBar
        actionBar!!.title = "FORMULARIO"
        actionBar.subtitle = "¡Hazte socio!"
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)  // para meter mi menu, que he creado, en este caso main_menu

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.itemId
        if (id == R.id.e_Home){
            NavUtils.navigateUpTo(this, Intent(this,MainActivity::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)

    }
}