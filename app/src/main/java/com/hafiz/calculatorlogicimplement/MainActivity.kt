package com.hafiz.calculatorlogicimplement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hafiz.calculatorlogicimplement.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var input1:Double = 0.0
    private var input2:Double = 0.0
    var addition:Boolean = false
    var subtraction:Boolean = false
    var multiplication:Boolean = false
    var division:Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        one.setOnClickListener {
            (textview.text.toString() +"1").also { textview.text = it }
        }
        two.setOnClickListener {
            textview.text = (textview.text.toString() + "2")

        }
        three.setOnClickListener {
            textview.text = (textview.text.toString() + "3")
        }
        four.setOnClickListener {
            textview.text = (textview.text.toString() + "4")

        }
        five.setOnClickListener {
            textview.text = (textview.text.toString() + "5")
        }
        six.setOnClickListener {
            textview.text = (textview.text.toString() + "6")
        }
        seven.setOnClickListener {
            textview.text = (textview.text.toString() + "7")
        }
        eight.setOnClickListener {
            textview.text = (textview.text.toString() + "8")
        }
        nine.setOnClickListener {
            textview.text = (textview.text.toString() + "9")
        }
        zero.setOnClickListener {
            textview.text = (textview.text.toString() + "0")
        }


        dot.setOnClickListener {
            textview.text = (textview.text.toString() + ".")

        }

        clear.setOnClickListener {
            textview.text = ""
            e2.text = ""

        }
        plus.setOnClickListener {

            if (textview.text.isNotEmpty()) {
                input1 = (textview.text.toString() + "").toDouble()
                addition = true
                textview.text = null
            }
        }
        min.setOnClickListener {

            if (textview.text.isNotEmpty()) {
                input1 = (textview.text.toString() + "").toDouble()
                subtraction = true
                textview.text = null
            }
        }
        mult.setOnClickListener {

            if (textview.text.isNotEmpty()) {
                input1 = (textview.text.toString() + "").toDouble()
                multiplication = true
                textview.text = null
            }
        }
        div.setOnClickListener {

            if (textview.text.isNotEmpty()) {
                input1 = (textview.text.toString() + "").toDouble()
                division = true
                textview.text = null
            }
        }

        equal.setOnClickListener {
            if (addition || subtraction || multiplication || division) {
                input2 = (textview.text.toString() + "").toDouble()
            }

            if (addition) {
               textview.text =(input1 + input2).toString()
                addition = false
            }

            if (subtraction) {
                textview.text=(input1 - input2).toString()
                subtraction = false
            }

            if (multiplication) {
                textview.text=(input1 * input2).toString()
                multiplication = false
            }

            if (division) {
                textview.text=(input1 / input2).toString()
                division = false
            }

        }

        }



}





