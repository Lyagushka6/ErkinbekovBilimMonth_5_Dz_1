package com.example.erkinbekovbilimmonth_5_dz_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.erkinbekovbilimmonth_5_dz_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
        presenter.attachView(this)
    }

    private fun initClicker() {
        binding.apply {
            btnPlus.setOnClickListener {
                presenter.plus()
            }
            btnMinus.setOnClickListener {
                presenter.minus()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.apply {
            tvZero.text = count.toString()
        }
    }

    override fun showToast() {
        Toast.makeText(applicationContext, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }

    override fun changeColor() {
        binding.apply {
            tvZero.setTextColor(getColor(R.color.green))
        }
    }

}