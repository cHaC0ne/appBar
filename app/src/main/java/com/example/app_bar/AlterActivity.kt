package com.example.app_bar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.app.NavUtils
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

        b.bInfo.setOnClickListener {
            val myIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://medlineplus.gov/spanish/druginfo/natural/1439.html")
            )
            startActivity(myIntent)
        }
        val actionBar = supportActionBar
        actionBar!!.title = "CBD"
        actionBar.subtitle = "Medicina Alternativa"
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            super.onCreateOptionsMenu(menu)
            menuInflater.inflate(R.menu.main_menu, menu)
            // para meter mi menu, que he creado, en este caso main_menu

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




//        when (item.itemId) {
//            R.id.e_Home -> {
//                Snackbar.make(b.root, "Volviendo", Snackbar.LENGTH_LONG).show()
//                return true
//            }

//        }