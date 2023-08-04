package devandroid.bruno.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.bruno.applistacurso.R;
import devandroid.bruno.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

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


/*
        dadosPessoa = " Primeiro Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();


        dadosOutraPessoa = " Primeiro Nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();
*/


        Log.i("POOAndroid", pessoa.toString());
        Log.i("POOAndroid", outraPessoa.toString());




    }
}