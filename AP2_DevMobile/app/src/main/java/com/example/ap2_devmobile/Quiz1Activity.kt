package com.example.ap2_devmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class Quiz1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz1_activity)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            Dados.musica = 1
            resposta1()
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            Dados.musica = 2
            resposta2()
        }
    }

    private fun resposta1() {
        val intent = Intent(this, Quiz2Activity::class.java)
        startActivity(intent)
    }

    private fun resposta2() {
        val intent = Intent(this, Quiz2Activity::class.java)
        startActivity(intent)
    }
}