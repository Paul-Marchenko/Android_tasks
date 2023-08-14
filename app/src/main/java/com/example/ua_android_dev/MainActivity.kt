package com.example.ua_android_dev

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity: Activity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val button:Button = findViewById(R.id.firstButton)
        val plusBtn:Button = findViewById(R.id.plusButton)
        val minusBtn:Button = findViewById(R.id.minusButton)
        button.setOnClickListener {
            val toast = Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG)
            toast.show()
        }
        plusBtn.setOnClickListener{
            counter++
            Toast.makeText(this, "Counter for plusButton: $counter", Toast.LENGTH_LONG).show()
        }
        minusBtn.setOnClickListener{
            counter--
            if (counter < 1) {
                Toast.makeText(this, "Counter is less than 1", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Counter for minusButton $counter", Toast.LENGTH_SHORT).show()
            }
        }
    }
}