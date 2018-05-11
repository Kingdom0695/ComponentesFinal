package componentesfinal.example.omen.componentesfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3;

    public void Inicializar(){
        btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent probar = new Intent(PrincipalActivity.this,PBActivity.class);
                startActivity(probar);
            }
        });
    }
    public void Inicializar2(){
        btn2 = (Button) findViewById(R.id.button4);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent swc = new Intent(PrincipalActivity.this,SCActivity.class);
                startActivity(swc);
            }
        });
    }

    public void Inicializar3(){
        btn3 = (Button) findViewById(R.id.button5);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent rdg = new Intent(PrincipalActivity.this,RDActivity.class);
                startActivity(rdg);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Inicializar();
        Inicializar2();
        Inicializar3();
    }
}
