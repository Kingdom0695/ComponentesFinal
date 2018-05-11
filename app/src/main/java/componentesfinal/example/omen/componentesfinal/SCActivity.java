package componentesfinal.example.omen.componentesfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class SCActivity extends AppCompatActivity {
    private Button btn3;
    private Switch swc1;

    public void Inicializar2(){
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent swc = new Intent(SCActivity.this,PrincipalActivity.class);
                startActivity(swc);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc);
        swc1 = (Switch) findViewById(R.id.switch2);
        btn3 = (Button) findViewById(R.id.button3);
        Inicializar2();

        swc1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (swc1.isChecked())
                    btn3.setVisibility(View.VISIBLE);
            }
        });
    }
}
