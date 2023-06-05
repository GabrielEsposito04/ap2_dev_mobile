import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.ap2.Quiz1Activity
import com.example.ap2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIniciar = findViewById<Button>(R.id.btnIniciar)
        btnIniciar.setOnClickListener {
            // Função a ser executada quando o botão for clicado
            iniciar()
        }
    }

    private fun iniciar() {
       val intent = Intent (this, Quiz1Activity::class.java )
        startActivity(intent)
        // Lógica para iniciar algo
        // Por exemplo, mostrar uma mensagem ou iniciar outra atividade
    }
}
