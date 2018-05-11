package componentesfinal.example.omen.componentesfinal;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class PBActivity extends AppCompatActivity {
    private Button btn2;
    private android.widget.ProgressBar proBar2;
    private TextView txtV2;

    private int contador = 0;

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pb);
        btn2 = (Button) findViewById(R.id.button2);
        proBar2 = (android.widget.ProgressBar) findViewById(R.id.progressBar2);
        txtV2 = (TextView) findViewById(R.id.txtv1);

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent proBar2 = new Intent(PBActivity.this,PrincipalActivity.class);
                startActivity(proBar2);
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (contador < 100){
                    contador++;
                    android.os.SystemClock.sleep(50);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            proBar2.setProgress(contador);
                        }
                    });
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        btn2.setVisibility(View.VISIBLE);
                        txtV2.setVisibility(View.VISIBLE);
                    }
                });
            }
        }).start();
    }
}
