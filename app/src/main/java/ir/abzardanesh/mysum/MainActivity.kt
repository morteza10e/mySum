package ir.abzardanesh.mysum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import ir.abzardanesh.mysum.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSum.setOnClickListener {
            val num1 = binding.editTextNumber.text.toString().toInt()
            val num2 = binding.editTextNumber2.text.toString().toInt()

            val sum = num1 + num2

            binding.textViewAns.text = sum.toString()

        }


        binding.buttonNegative.setOnClickListener {
            val num1 = binding.editTextNumber.text.toString().toInt()
            val num2 = binding.editTextNumber2.text.toString().toInt()

            val menha = num1 - num2

            binding.textViewAns.text = menha.toString()

        }




    }
}