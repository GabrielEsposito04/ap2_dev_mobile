package com.example.ap2_devmobile

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RespostaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resposta_activity)
        val textoResposta1: TextView = findViewById(R.id.Resposta1)
        if (Dados.musica == 1){
            textoResposta1.text = "Parabens você é um bebedor Raiz"
        }
        val btnlink : ImageButton = findViewById(R.id.butaolink1)
        btnlink.setOnClickListener {
            val intent = Intent
        }
    }
}