package somdosbichos.gabriel.com.somdosbichos;

import android.app.Activity;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = (ImageView) findViewById(R.id.caoid);
        gato = (ImageView) findViewById(R.id.gatoid);
        leao = (ImageView) findViewById(R.id.leaoid);
        macaco = (ImageView) findViewById(R.id.macacoid);
        ovelha = (ImageView) findViewById(R.id.ovelhaid);
        vaca = (ImageView) findViewById(R.id.vacaid);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.caoid:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                tocarSoom();
                break;
            case R.id.gatoid:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                tocarSoom();
                break;
            case R.id.leaoid:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                tocarSoom();
                break;
            case R.id.macacoid:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                tocarSoom();
                break;
            case R.id.ovelhaid:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                tocarSoom();
                break;
            case R.id.vacaid:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                tocarSoom();
                break;




        }

    }

    public void tocarSoom(){
        if(mediaPlayer!= null){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {


        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
