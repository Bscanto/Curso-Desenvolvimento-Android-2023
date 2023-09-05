package devandroid.bruno.euseicontar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        // Recupere os resultados dos extras
        int respostasCorretas = getIntent().getIntExtra("respostasCorretas", 0);
        int respostasIncorretas = getIntent().getIntExtra("respostasIncorretas", 0);

        // Atualize os TextViews com os resultados
        TextView textViewCorretas = findViewById(R.id.txt_respostas_corretas);
        TextView textViewIncorretas = findViewById(R.id.txt_respostas_incorretas);

        textViewCorretas.setText("Respostas Corretas: " + respostasCorretas);
        textViewIncorretas.setText("Respostas Incorretas: " + respostasIncorretas);

        // Configurar o botão "Reiniciar"
        Button btnReiniciar = findViewById(R.id.btn_reiniciar);
        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reiniciarJogo();
            }
        });
    }

    private void reiniciarJogo() {
        Intent intent = new Intent(resultado.this, MainActivity.class);
        startActivity(intent);
        finish(); // Encerrar a atividade atual (ResultadoActivity)
    }
}
