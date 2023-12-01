package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.button1
import kotlinx.android.synthetic.main.activity_main.button2
import kotlinx.android.synthetic.main.activity_main.button3
import kotlinx.android.synthetic.main.activity_main.button4
import kotlinx.android.synthetic.main.activity_main.button5
import kotlinx.android.synthetic.main.activity_main.button6
import kotlinx.android.synthetic.main.activity_main.button7
import kotlinx.android.synthetic.main.activity_main.button8
import kotlinx.android.synthetic.main.activity_main.button9

class MainActivity : AppCompatActivity() {
    var flag = 0
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

    }


    fun tictactoe(view: View) {
        count++
        val btnCurrent = view as Button
        val mytext:TextView=findViewById(R.id.textView2)
        if (btnCurrent.text == "") {

            if (flag == 0) {
                btnCurrent.text = "X"
                btnCurrent.textSize=50f
                mytext.text="Turn : O"

                flag=1
            } else {
                btnCurrent.text = "O"
                btnCurrent.textSize=50f
                mytext.text="Turn : X"
                flag = 0
            }


            val b1 = button1.text.toString()
            val b2 = button2.text.toString()
            val b3 = button3.text.toString()
            val b4 = button4.text.toString()
            val b5 = button5.text.toString()
            val b6 = button6.text.toString()
            val b7 = button7.text.toString()
            val b8 = button8.text.toString()
            val b9 = button9.text.toString()

            if (b1 == b2 && b2 == b3 && b3 != "") {
                Toast.makeText(this@MainActivity, "winner is $b1", Toast.LENGTH_LONG).show()
                new_game()
            } else if (b4 == b5 && b5 == b6 && b6 != "") {
                Toast.makeText(this@MainActivity, "winner is $b4", Toast.LENGTH_LONG).show()
                new_game()
            } else if (b7 == b8 && b8 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "winner is $b7", Toast.LENGTH_LONG).show()
                new_game()
            } else if (b1 == b4 && b4 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "winner is $b1", Toast.LENGTH_LONG).show()
                new_game()
            } else if (b2 == b5 && b5 == b8 && b8 != "") {
                Toast.makeText(this@MainActivity, "winner is $b2", Toast.LENGTH_LONG).show()
                new_game()
            } else if (b3 == b6 && b6 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "winner is $b3", Toast.LENGTH_LONG).show()
                new_game()
            } else if (b1 == b5 && b5 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "winner is $b1", Toast.LENGTH_LONG).show()
                new_game()
            } else if (b3 == b5 && b5 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "winner is $b3", Toast.LENGTH_LONG).show()
                new_game()
            } else if (count == 9) {
                Toast.makeText(this@MainActivity, "DRAW", Toast.LENGTH_LONG).show()
                new_game()
            }


        }
    }

    fun new_game() {
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""
        flag = 0
        count = 0
        val mytext1:TextView=findViewById(R.id.textView2)
        mytext1.text="Turn : X"
    }
}


