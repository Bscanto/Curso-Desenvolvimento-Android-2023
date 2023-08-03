package devandroid.bruno.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.bruno.applistacurso.R;
import devandroid.bruno.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        // Atriduir conteúdo, dados, valores para o objeto
        pessoa.setPrimeiroNome("Bruno");
        pessoa.setSobreNome("Canto");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("55-999999999");


        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobreNome("Silva");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("55-999999991");


        int parada = 0;

    }
}