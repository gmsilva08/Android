package corpersonalizada.gabriel.com.corpersonalizada;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonSelecionado;
    private Button botaoSalvar;
    private static final String arquivoPreferencia = "ArqPreferencia";
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupid);
        botaoSalvar = (Button) findViewById(R.id.botaoSalvarid);
        layout = (RelativeLayout) findViewById(R.id.layoutid);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idRadioButtoneEcolhido = radioGroup.getCheckedRadioButtonId();

                if(idRadioButtoneEcolhido >0) {

                    radioButtonSelecionado = (RadioButton) findViewById(idRadioButtoneEcolhido);
                    SharedPreferences sharedPreferences = getSharedPreferences(arquivoPreferencia, 0);
                    SharedPreferences.Editor editor= sharedPreferences.edit();
                    String corEscolhida = radioButtonSelecionado.getText().toString();
                    editor.putString("corEscolhida", corEscolhida);
                    editor.commit();

                    setBackground(corEscolhida);


                }

            }



        });
        //Recuperar cor salva
        SharedPreferences sharedPreferences = getSharedPreferences(arquivoPreferencia, 0);
        if(sharedPreferences.contains("corEscolhida")){
            String corRecuperar = sharedPreferences.getString("corEscolhida", "Laranja");
            setBackground(corRecuperar);
        }
    }

    private void setBackground(String cor){
        if(cor.equals("Azul")){
            layout.setBackgroundColor(Color.parseColor("#FF3C5FD1"));
        }else if(cor.equals("Laranja")){
            layout.setBackgroundColor(Color.parseColor("#ffff8800"));
        }else if(cor.equals("Verde")){
            layout.setBackgroundColor(Color.parseColor("#ff669900"));
        }
    }
}
