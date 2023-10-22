package com.example.alertdialogkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonOnClick(view : View){
        val alert = AlertDialog.Builder(this@MainActivity)

        alert.setTitle("Save")
        alert.setMessage("Are you sure?")

        alert.setPositiveButton("Yes", object  : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity,"Saved.",Toast.LENGTH_LONG).show()
            }

        })

        alert.setNegativeButton("No", object :DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity,"No Saved.",Toast.LENGTH_LONG).show()
            }

        })
        alert.show()
    }
}