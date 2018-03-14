package caraoucoroa.gabriel.com.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;

public class SegundaActivity extends AppCompatActivity {

    private ImageView imagem;
    private ImageView botaoVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        imagem = (ImageView) findViewById(R.id.moedaid);
        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarid);

        Bundle extra = getIntent().getExtras();
        if(extra != null){

            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("Cara")){
                //imagem cara
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else{
                //imagem coroa
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));

            };
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SegundaActivity.this, MainActivity.class));
            }
        });
    }
}
