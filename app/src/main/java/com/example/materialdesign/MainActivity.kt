package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var toolbar:Toolbar=findViewById(R.id.tool)
        toolbar.setTitle("harry")
        toolbar.setSubtitle("we're from the stark")
        toolbar.inflateMenu(R.menu.menu_main)
        toolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.save1->{
                    var intent=Intent(this,second::class.java)
                    startActivity(intent)
                }
                R.id.save->{
                    Toast.makeText(this,"you've selected save button",Toast.LENGTH_SHORT).show()
                }
                R.id.email->{
                    Toast.makeText(this,"you've selected email button",Toast.LENGTH_SHORT).show()
                }
            }


            true
        }
    }

}