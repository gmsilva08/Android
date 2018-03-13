package idadedecachorro.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixatexto;
    private Button botaoidade;
    private TextView resultadoidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixatexto = (EditText) findViewById(R.id.caixaid);
        botaoidade = (Button) findViewById(R.id.botaoid);
        resultadoidade = (TextView) findViewById(R.id.resultadoid);

        botaoidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //recuperar o que foi digitado

                String textoDigitado = caixatexto.getText().toString();

                if(textoDigitado.isEmpty()){
                    //Mensagem de erro caixa vazia
                    resultadoidade.setText("Erro:\n Digite a idade do seu cachorro");

                }else{
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;
                    resultadoidade.setText("A idade do seu cachorro em anos humanos é: \n" +resultadoFinal + " ano(s)");
                }
            }
        });
    }
}
