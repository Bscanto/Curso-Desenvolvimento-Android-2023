package devandroid.bruno.euseicontar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button jogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = findViewById(R.id.btn_jogar); // converter a variavel chamando a atividade do botão no layout

        jogar.setOnClickListener(new View.OnClickListener() { // chamando o evento toque no botão
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Jogo.class);
                int numero = new Random().nextInt(4);
                intent.putExtra("numero", numero);
                startActivity(intent);
            }
        });
    }
}