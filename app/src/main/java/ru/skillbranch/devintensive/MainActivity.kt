package ru.skillbranch.devintensive

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("M_MainActivity","onCreate")

    }


    override fun onStart() {
        Log.d("M_MainActivity","onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("M_MainActivity","onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("M_MainActivity","onPause")
        super.onPause()
    }
    override fun onStop() {
        Log.d("M_MainActivity","onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("M_MainActivity","onDestroy")
        super.onDestroy()
    }
}
