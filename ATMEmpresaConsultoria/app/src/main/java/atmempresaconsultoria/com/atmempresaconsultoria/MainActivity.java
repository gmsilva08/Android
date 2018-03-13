package atmempresaconsultoria.com.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoEmpresa;
    private ImageView botaoServico;
    private ImageView botaoCliente;
    private ImageView botaoContato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Chamada do  botão Empresa
        botaoEmpresa = (ImageView) findViewById(R.id.empresaid);

        botaoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        //Chamada do Botão Serviço
        botaoServico = (ImageView) findViewById(R.id.servicoid);
        botaoServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
            }
        });

        //Chamada do Botão Contato
        botaoCliente = (ImageView) findViewById(R.id.clienteid);
        botaoCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ClienteActivity.class));
            }
        });

        //Chamada do Botão contato
        botaoContato = (ImageView) findViewById(R.id.contatoid);
        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });
    }
}
