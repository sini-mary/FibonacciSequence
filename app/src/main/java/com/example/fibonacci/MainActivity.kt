package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
        }

        override fun onResume() {
            super.onResume()
            fibonacci()

        }

        fun fibonacci() {
            var num1 = 0
            var num2 = 1
            var c: Int

            var numbers= mutableListOf<Int>(num1,num2)
            while (true) {
                c = num1 + num2
                if (c > 100)
                    break

                numbers.add(c)

                num1 = num2
                num2 = c
            }


            binding.rvNumbers.layoutManager= LinearLayoutManager(this)
            var numbersAdapter=valuesRVAdapter(numbers)
            binding.rvNumbers.adapter=numbersAdapter
        }

    }
}