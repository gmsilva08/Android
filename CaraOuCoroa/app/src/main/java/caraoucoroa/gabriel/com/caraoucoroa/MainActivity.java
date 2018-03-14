package caraoucoroa.gabriel.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView jogar;
    private String[] opcao = {"Cara", "Coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = (ImageView) findViewById(R.id.botaoJogarid);

        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Gerar úmero aleatorio
                Random randomico = new Random();
                int num1 = randomico.nextInt(2);

                //0 = cara 1 = coroa
                //opcao[num1]
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("opção", opcao[num1]);

                startActivity(intent);

            }
        });



    }
}
