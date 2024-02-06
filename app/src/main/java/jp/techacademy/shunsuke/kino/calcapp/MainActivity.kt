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
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        val editText1 = findViewById<View>(R.id.editText1) as EditText
        val input1 = editText1.text.toString().toFloatOrNull()

        val editText2 = findViewById<View>(R.id.editText2) as EditText
        val input2 = editText2.text.toString().toFloatOrNull()

        intent.putExtra("INPUT1", input1)
        intent.putExtra("INPUT2", input2)
        startActivity(intent)
    }
}