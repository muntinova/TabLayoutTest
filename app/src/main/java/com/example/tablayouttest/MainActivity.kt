package com.example.tablayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TableRow
import android.widget.TextView
import android.graphics.Color
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener{
            if(android_version.text.toString().isEmpty() || android_code_name.text.toString().isEmpty()) {
                Toast.makeText(this, "Enter Android version and code name", Toast.LENGTH_LONG).show()
            } else{
                val tableRow = TableRow(getApplicationContext())
                val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
                layoutParams.setMargins(15, 10, 15, 10)
                tableRow.setLayoutParams(layoutParams)

                val value = TextView(this)
                value.text = android_version.text.toString()
                value.layoutParams = layoutParams
                value.textSize = 20F
                value.setBackgroundColor(Color.parseColor("#D81B61"))
                val value2 = TextView(this)
                value2.text = android_code_name.text.toString()
                value2.layoutParams = layoutParams
                value2.textSize = 20F
                value2.setBackgroundColor(Color.parseColor("#D81B61"))
                tableRow.addView(value, 0)
                tableRow.addView(value2, 1)
                table.addView(tableRow)
                android_version.text.clear()
                android_code_name.text.clear()

            }

        }

    }

}