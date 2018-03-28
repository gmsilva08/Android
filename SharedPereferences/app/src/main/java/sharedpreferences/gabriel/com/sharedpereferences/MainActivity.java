package sharedpreferences.gabriel.com.sharedpereferences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText textoNome;
    private Button botaoSalvar;
    private TextView textoExibicao;

    private static final String ARQUIVO_PEFERENCIA = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNome = (EditText) findViewById(R.id.entradaid);
        textoExibicao = (TextView) findViewById(R.id.exibicaoid);
        botaoSalvar = (Button) findViewById(R.id.salvarid);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PEFERENCIA, 0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                if(textoNome.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Favor preencher o nome", Toast.LENGTH_LONG).show();
                }else {
                    editor.putString("nome", textoNome.getText().toString());
                    editor.commit();
                    textoExibicao.setText("Olá, "+ textoNome.getText().toString());
                }

            }
        });

        //Recuperar o qe foi salvo
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PEFERENCIA, 0);
        if (sharedPreferences.contains("nome")){
            String nome = sharedPreferences.getString("nome", "Usuário não definido");
            textoExibicao.setText("Olá,  "+nome);
        }else{
            textoExibicao.setText("Olá , usário não definido");
        }

    }
}
