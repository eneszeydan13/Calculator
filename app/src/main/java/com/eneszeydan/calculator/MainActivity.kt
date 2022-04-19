package com.eneszeydan.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eneszeydan.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    var typedNumber = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var numbers = ArrayList<Int>()
        var currentNumber = 0

        binding.apply {
            buttonZero.setOnClickListener {
                pressedButton(0)
                textView.text = textView.text.toString() + "0"
            }
            buttonOne.setOnClickListener {
                pressedButton(1)
                textView.text = textView.text.toString() + "1"
            }
            buttonTwo.setOnClickListener {
                pressedButton(2)
                textView.text = textView.text.toString() + "2"
            }
            buttonThree.setOnClickListener {
                pressedButton(3)
                textView.text = textView.text.toString() + "3"
            }
            buttonFour.setOnClickListener {
                pressedButton(4)
                textView.text = textView.text.toString() + "4"
            }
            buttonFive.setOnClickListener {
                pressedButton(5)
                textView.text = textView.text.toString() + "5"
            }
            buttonSix.setOnClickListener {
                pressedButton(6)
                textView.text = textView.text.toString() + "6"
            }
            buttonSeven.setOnClickListener {
                pressedButton(7)
                textView.text = textView.text.toString() + "7"
            }
            buttonEight.setOnClickListener {
                pressedButton(8)
                textView.text = textView.text.toString() + "8"
            }
            buttonNine.setOnClickListener {
                pressedButton(9)
                textView.text = textView.text.toString() + "9"
            }

            buttonPlus.setOnClickListener {
                textView.text = textView.text.toString() + " + "
                currentNumber = typedNumber.toInt()
                typedNumber = ""
                numbers.add(currentNumber)
            }

            buttonEqual.setOnClickListener {
                currentNumber = typedNumber.toInt()
                numbers.add(currentNumber)
                textView.text = "= ${numbers.sum()}"
                typedNumber = ""
            }

            buttonClear.setOnClickListener {
                textView.text = ""
                typedNumber = ""
                numbers.clear()
            }


        }
    }

    private fun pressedButton(value:Int){
        typedNumber += "$value"
    }
}