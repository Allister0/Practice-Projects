package com.example.mycarpetapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{

    private var length: EditText? = null
    private var width: EditText? = null
    private var result: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        length = findViewById(R.id.inputLength)
        width = findViewById(R.id.inputWidth)
        result = findViewById(R.id.output)

        length?.setOnClickListener{ view-> view.showsoftkeyboard() }
        width?.setOnClickListener{ view-> view.showsoftkeyboard() }
    }

    //check onClick in the view
    fun onClick(v: View)
    {
        v.hidesoftkeyboard()

        //Initialize temp variables
        var l = 0.0
        var w = 0.0

        //unwrap optionals
        if(!length?.text.isNullOrEmpty())
        {
            l = length?.text.toString().toDouble()
        }

        if (!width?.text.isNullOrEmpty())
        {
            w = width?.text.toString().toDouble()
        }

        val theResult = l * w / 9     //calculate yardage
        result?.text = String.format(("%.${2}f yards").format(theResult))
    }


    //show soft keyboard
    private fun View.showsoftkeyboard()
    {
        if (requestFocus())
        {
            val imm =  getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
        }
    }

    //Hide soft keyboard
    private fun View.hidesoftkeyboard()
    {
        val imm =  getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken,0)
    }






}