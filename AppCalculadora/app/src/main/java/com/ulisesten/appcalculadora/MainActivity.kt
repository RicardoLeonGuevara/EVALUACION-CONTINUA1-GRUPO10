package com.ulisesten.appcalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.ulisesten.appcalculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding? = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var year: Int
        var res: String = "No bisiesto"

        binding!!.btncalcular.setOnClickListener {
            year = binding.year.text.toString().toInt()

            if(year%4 == 0 && (year % 100 != 0 || year % 400 == 0))
                res = "Bisiesto"

            binding.tvresultado.text = res
        }


    }
}