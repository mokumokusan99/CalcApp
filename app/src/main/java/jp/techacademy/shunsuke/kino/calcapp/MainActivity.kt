package jp.techacademy.shunsuke.kino.calcapp


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import jp.techacademy.shunsuke.kino.calcapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        val editText1 = findViewById<View>(R.id.editText1) as EditText
        val input1 = editText1.text.toString().toFloatOrNull()

        val editText2 = findViewById<View>(R.id.editText2) as EditText
        val input2 = editText2.text.toString().toFloatOrNull()

        val input3 = when (v?.id) {
            R.id.button -> 1
            R.id.button2 -> 2
            R.id.button3 -> 3
            R.id.button4 -> 4
            else -> 0
        }

            intent.putExtra("INPUT1", input1)
            intent.putExtra("INPUT2", input2)
            intent.putExtra("INPUT3", input3)

        startActivity(intent)
    }
}