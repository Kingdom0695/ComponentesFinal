package componentesfinal.example.omen.componentesfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RDActivity extends AppCompatActivity {
    private Button btn1;
    private RadioGroup rdg1;
    private RadioButton rd1,rd2;

    public void Inicializar3(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent radiog = new Intent(RDActivity.this, PrincipalActivity.class);
                startActivity(radiog);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rd);

        rd1 = (RadioButton) findViewById(R.id.radioButton);
        rd2 = (RadioButton) findViewById(R.id.radioButton2);
        rdg1 = (RadioGroup) findViewById(R.id.radiog);
        btn1 = (Button) findViewById(R.id.button1);

        rd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rd1.isChecked()) {
                    btn1.setVisibility(View.VISIBLE);
                }else btn1.setVisibility(View.INVISIBLE);
            }
        });
        Inicializar3();
    }
}
