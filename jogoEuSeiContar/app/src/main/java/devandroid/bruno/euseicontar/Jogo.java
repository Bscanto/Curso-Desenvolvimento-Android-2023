package devandroid.bruno.euseicontar;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.GridLayout;
import java.util.Random;

public class Jogo extends AppCompatActivity {

    private GridLayout gridLayout;
    private Button voltar;
    private int numeroTotalDeImagens;
    private int rodadas = 1;
    private int[] imagensPorRodada = {
            R.drawable.maca,
            R.drawable.bola,
            R.drawable.gato,
            R.drawable.mochila
    };
    private int numero;
    private int respostasCorretas = 0;
    private int respostasIncorretas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        gridLayout = findViewById(R.id.gridLayout);
        Bundle dados = getIntent().getExtras();
        numero = dados.getInt("numero");

        voltar = findViewById(R.id.btn_reiniciar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Jogo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        iniciarRodada();
    }

    private void iniciarRodada() {

        int randomImageIndex = new Random().nextInt(imagensPorRodada.length);
        int imagemRodadaAtual = imagensPorRodada[randomImageIndex];


        int randomRepeat = new Random().nextInt(9) + 1;
        numeroTotalDeImagens = randomRepeat;


        for (int i = 0; i < numeroTotalDeImagens; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(imagemRodadaAtual);

            int sizeInDp = getResources().getDimensionPixelSize(R.dimen.image_size_small);
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.width = sizeInDp;
            layoutParams.height = sizeInDp;
            layoutParams.leftMargin = 30;
            imageView.setLayoutParams(layoutParams);
            gridLayout.addView(imageView);
        }
    }

    public void tecla(View view) {
        Button button = (Button) view;
        int numeroDigitado = Integer.parseInt(button.getText().toString());

        if (numeroDigitado == numeroTotalDeImagens) {
            respostasCorretas++;
        } else {
            respostasIncorretas++;
        }


        if (rodadas < 5) {
            rodadas++;
            gridLayout.removeAllViews();
            iniciarRodada();
        } else {
            abrirResultadoActivity();
        }
    }

    private void abrirResultadoActivity() {

        Intent intent = new Intent(Jogo.this, resultado.class);

        intent.putExtra("respostasCorretas", respostasCorretas);
        intent.putExtra("respostasIncorretas", respostasIncorretas);
        startActivity(intent);
        finish();
    }
}
