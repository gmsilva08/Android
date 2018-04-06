package sqlite.gabriel.com.sqlite;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            SQLiteDatabase bancodedados = openOrCreateDatabase("app", MODE_PRIVATE, null);

            ////Criar tabela
           bancodedados.execSQL("CREATE TABLE IF NOT EXISTS pessoas(id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3))");

            //Inserir dados na tabela
            bancodedados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Gabriel', 23)");
            bancodedados.execSQL(("INSERT INTO pessoas(nome, idade) VALUES('jean', 19)"));
            bancodedados.execSQL(("INSERT INTO pessoas(nome, idade) VALUES('Ângela', 62)"));
            bancodedados.execSQL(("INSERT INTO pessoas(nome, idade) VALUES('Sandra', 23)"));*/
            bancodedados.execSQL("UPDATE pessoas SET idade = 23, nome 'Paloma' WHERE id = 4");
            bancodedados.execSQL("DELETE FROM pessoas where nome = 'Sandra'");
            bancodedados.execSQL("DROP TABLE pessoas");

            Cursor cursor = bancodedados.rawQuery("SELECT * FROM pessoas ", null);

            int indiceColunaNome = cursor.getColumnIndex("nome");
            int indiceColunaIdade = cursor.getColumnIndex("idade");
            int indiceColunaID = cursor.getColumnIndex("id");

            cursor.moveToFirst();

            while (cursor != null) {
                Log.i("Resultado - nome: ", cursor.getString(indiceColunaNome));
                Log.i("Resultado - idade: ", cursor.getString(indiceColunaIdade));
                Log.i("RESULTADO - id: ", cursor.getString(indiceColunaID));
                cursor.moveToNext();


            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
