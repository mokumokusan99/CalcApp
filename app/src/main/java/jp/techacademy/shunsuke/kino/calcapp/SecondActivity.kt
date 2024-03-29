package jp.techacademy.shunsuke.kino.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.techacademy.shunsuke.kino.calcapp.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val value1 = intent.getFloatExtra("INPUT1",0.0f)
        val value2 = intent.getFloatExtra("INPUT2", 0.0f)

        val value3 = intent.getIntExtra("INPUT3",0)

            when(value3) {
                1 -> {
                    binding.textView.text = "${value1 + value2}"
                }
                2 -> {
                    binding.textView.text = "${value1 - value2}"
                }
                3 -> {
                    binding.textView.text = "${value1 * value2}"
                }
                4 -> {
                    binding.textView.text = "${value1 / value2}"
                }
                else -> {

                }
            }
    }

}