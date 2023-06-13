package com.example.ap2_devmobile

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RespostaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resposta_activity)
        val textoResposta1: TextView = findViewById(R.id.Resposta1)
        val url: String = "asas"
        val imagemResposta: ImageView = findViewById(R.id.imageView)
        val btnSite: Button = findViewById(R.id.site)
        if (Dados.musica == 1 && Dados.Bebida == 1 && Dados.Ambiente == 1) {
            val img = R.drawable.resposta1
            imagemResposta.setImageResource(img)
            val url = "https://bfw.group/bar-do-zeca-pagodinho/"
            btnSite.setOnClickListener {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, url)
                startActivity(intent)
            }
        } else if (Dados.musica == 2 && Dados.Bebida == 2 && Dados.Ambiente == 2) {
            val img = R.drawable.resp2
            imagemResposta.setImageResource(img)
            val url = "https://www.vizinhogastrobar.com/"
            btnSite.setOnClickListener {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, url)
                startActivity(intent)
            }
        } else if (Dados.musica == 1 && Dados.Bebida == 1 && Dados.Ambiente == 2) {
            val img = R.drawable.resposta1
            imagemResposta.setImageResource(img)
            val url = "https://bfw.group/bar-do-zeca-pagodinho/"
            btnSite.setOnClickListener {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, url)
                startActivity(intent)
            }
        } else if (Dados.musica == 1 && Dados.Bebida == 2 && Dados.Ambiente == 1) {
            val img = R.drawable.resposta1
            imagemResposta.setImageResource(img)
            val url = "https://bfw.group/bar-do-zeca-pagodinho/"
            btnSite.setOnClickListener {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, url)
                startActivity(intent)
            }
        } else if (Dados.musica == 2 && Dados.Bebida == 1 && Dados.Ambiente == 1) {
            val img = R.drawable.resposta1
            imagemResposta.setImageResource(img)
            val url = "https://bfw.group/bar-do-zeca-pagodinho/"
            btnSite.setOnClickListener {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, url)
                startActivity(intent)
            }
        } else if (Dados.musica == 2 && Dados.Bebida == 2 && Dados.Ambiente == 1) {
            val img = R.drawable.resp2
            imagemResposta.setImageResource(img)
            val url = "https://www.vizinhogastrobar.com/"
            btnSite.setOnClickListener {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, url)
                startActivity(intent)
            }
        } else if (Dados.musica == 2 && Dados.Bebida == 1 && Dados.Ambiente == 2) {
            val img = R.drawable.resp2
            imagemResposta.setImageResource(img)
            val url = "https://www.vizinhogastrobar.com/"
            btnSite.setOnClickListener {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, url)
                startActivity(intent)
            }
        } else if (Dados.musica == 1 && Dados.Bebida == 2 && Dados.Ambiente == 2) {
            val img = R.drawable.resp2
            imagemResposta.setImageResource(img)
            val url = "https://www.vizinhogastrobar.com/"
            btnSite.setOnClickListener {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, url)
                startActivity(intent)
            }

        }
    }
}