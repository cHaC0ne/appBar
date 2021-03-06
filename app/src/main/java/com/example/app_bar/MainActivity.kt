package com.example.app_bar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.core.app.NavUtils
import com.example.app_bar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
companion object {
    val ID_ARTICULOS = Menu.FIRST
    val ID_SEMILLAS = Menu.FIRST + 2
    val ID_CATAS = Menu.FIRST + 3
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.bSocio.setOnClickListener {
            val myIntent = Intent(this, FormuActivity::class.java)
            startActivity(myIntent)
        }


        actionBar?.setHomeButtonEnabled(true)

        val actionBar = supportActionBar
        actionBar!!.title = "COFFE-SHOP"
        actionBar.subtitle = "Bueno, bonito y barato"
        actionBar.setIcon(R.drawable.ic_joint)
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
        registerForContextMenu(b.iMar)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(Menu.NONE, ID_ARTICULOS , Menu.NONE, "Articulos")  //PAra crear mis propias opciones de menu desde el codigo
        menu.add(Menu.NONE, ID_SEMILLAS, Menu.NONE, "Semillas")
        menu.add(Menu.NONE, ID_CATAS, Menu.NONE,"Catas Programadas")


         super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)
         // para meter mi menu, que he creado, en este caso main_menu
        val sub = menu?.addSubMenu(0,0, Menu.NONE, "Hash ")
        sub?.setHeaderIcon(R.drawable.ic_fuego)
        val elementoSubmenu = sub?.add(0,0, Menu.NONE, "Isolator")
        val elementoSubmenu2 = sub?.add(0,0, Menu.NONE, "Hydroponic")
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.itemId) {
            R.id.iMenu1 -> { Snackbar.make(b.root, "Incica", Snackbar.LENGTH_LONG).show()
                return true
            }
            R.id.iMenu2 -> { Snackbar.make(b.root, "Sativa", Snackbar.LENGTH_LONG).show()
                return true
            }
            R.id.iMenu3 -> { val myIntent = Intent(this, AlterActivity::class.java)
                startActivity(myIntent)
                return true
            }
            R.id.e_Search -> { Snackbar.make(b.root, "Search", Snackbar.LENGTH_LONG).show()
                return true
            }
            R.id.e_Refresh -> {Snackbar.make(b.root, "Actualizando", Snackbar.LENGTH_LONG).show()
            return true
            }
            R.id.e_Home -> {Snackbar.make(b.root,"Volviendo", Snackbar.LENGTH_LONG).show()
            return true
            }



        }
        return false
    }

    override fun onCreateContextMenu ( menu: ContextMenu?, v: View?,  menuInfo: ContextMenu.ContextMenuInfo?  ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        if (v?.id == R.id.iMar){
            menuInflater.inflate(R.menu.menu_contextual, menu)

        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
         super.onContextItemSelected(item)
        when (item.itemId) {
            R.id.e_p1 -> {
                Snackbar.make(b.root, "Pueba 1", Snackbar.LENGTH_LONG).show()
                return true
            }
        }
        return false
    }
}