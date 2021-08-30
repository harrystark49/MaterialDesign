package com.example.materialdesign

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.Toast
import android.widget.Toolbar
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.sec.*

class second:AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sec)

        var layout:RelativeLayout=findViewById(R.id.relative)

        var toolbar1:androidx.appcompat.widget.Toolbar=findViewById(R.id.toolbar1)
        toolbar1.setTitle("contextual")
        toolbar1.inflateMenu(R.menu.snakbar)
        toolbar1.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.simplesnakbar->{

                    Snackbar.make(layout,"this is simple snackbar",Snackbar.LENGTH_LONG).show()
                }
                R.id.actionsnackbar->{
                    var snackbar:Snackbar=Snackbar.make(layout,"deletion is successful",Snackbar.LENGTH_LONG)
                    snackbar.setAction("undo", View.OnClickListener {
                        Snackbar.make(layout,"deletion is successful",Snackbar.LENGTH_LONG).show()
                    })
                    snackbar.show()
                }
            }
            true
        }
        fab.setOnClickListener {
            Snackbar.make(layout,"deletion is successful",Snackbar.LENGTH_LONG).show()
        }
    }
}

private fun Snackbar.setAction(s: String, onClickListener: Unit) {

}
