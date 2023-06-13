package com.example.ap2_devmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Quiz3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz3_activity)

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            Dados.Ambiente = 1
            resposta5()
        }
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            Dados.Ambiente = 2
            resposta6()
        }
    }

    private fun resposta5() {
        val intent = Intent(this, RespostaActivity::class.java)
        startActivity(intent)
    }

    private fun resposta6() {
        val intent = Intent(this, RespostaActivity::class.java)
        startActivity(intent)
    }
}
