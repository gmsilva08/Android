package series.gabriel.com.series;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {
    private SeekBar seekbar;
    private ImageView exibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = (SeekBar) findViewById(R.id.seekbarid);
        exibicao = (ImageView) findViewById(R.id.exibicaoid);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int valorProgresso = i;

                if(valorProgresso == 1){
                    exibicao.setImageResource(R.drawable.pouco);
                }else if(valorProgresso == 2){
                    exibicao.setImageResource(R.drawable.medio);
                }else if (valorProgresso == 3){
                    exibicao.setImageResource(R.drawable.muito);
                }else if(valorProgresso == 4){
                    exibicao.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
