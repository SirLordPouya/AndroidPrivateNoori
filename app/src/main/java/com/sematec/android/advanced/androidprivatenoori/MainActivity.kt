package com.sematec.android.advanced.androidprivatenoori

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = arrayListOf(10,1,345,2,9,3)

        list
            .filter { it > 5 }
            .map { it * 2 }
            .sorted()
            .forEach {
                Log.d("TAG",it.toString())
            }
        val list2 = arrayListOf(10,10,5,2,2,3)

        list2
            .distinct()
            .forEach {
                Log.d("TAG2",it.toString())
            }

    }
}
