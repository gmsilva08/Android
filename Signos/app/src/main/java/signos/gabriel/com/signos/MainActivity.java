package signos.gabriel.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ListView listasignos;
    private String[] Signos={
            "Áries", "Aquário", "Gẽmeos", "Cãncer", "Leão", "Virgem",
            "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário",
            "Peixes"
    };

    private String [] perfis ={
            "Corajoso, determinado, confiante, entusiasmado, otimista, honesto, passional",
            "Confiável, paciente, prático, dedicado, responsável, estável",
            "Gentil, carinhoso, curioso, adaptável, habilidade de rápido aprendizado e troca de ideias",
            "Tenaz, altamente criativo, leal, emocional, simpático, persuasivo",
            "Criativo, apaixonado, generoso, caloroso, alegre, bem-humorado",
            "Fiel, analítico, gentil, trabalhador, prático",
            "Cooperativo, diplomático, gracioso, justo, social",
            "Versátil, corajoso, apaixonado, teimoso, amigo verdadeiro",
            "Generoso, idealista, grande senso de humor",
            "Responsável, disciplinado, autocontrole, bom gerente",
            "Progressivo, original, independente, humanitário",
            "Compassivo, artístico, intuitivo, gentil, sábio, musical"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listasignos = (ListView) findViewById(R.id.listviewid);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                Signos
        );

        listasignos.setAdapter(adaptador);

        listasignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int codPosicao =i;
                Toast.makeText(getApplicationContext(),
                        perfis[codPosicao],
                Toast.LENGTH_LONG).show();
            }
        });
    }
}
