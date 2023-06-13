package com.example.ap2_devmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Quiz2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz2_activity)

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            Dados.Bebida = 1
           resposta3()
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            Dados.Bebida = 2
            resposta4()
        }
    }

    private fun resposta3() {
        val intent = Intent(this, Quiz3Activity::class.java)
        startActivity(intent)
    }

    private fun resposta4() {
        val intent = Intent(this, Quiz3Activity::class.java)
        startActivity(intent)
    }
}
