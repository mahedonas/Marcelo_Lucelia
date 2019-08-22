package br.com.etecia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class JanelaDois_Activity extends AppCompatActivity {

    Button btnvoltarjanela1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_dois_layout);

        btnvoltarjanela1 = (Button) findViewById(R.id. btnVoltarJanela1);
        btnvoltarjanela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Clique aqui",
                        Toast.LENGTH_SHORT). show();

                
            }
        });



    }
}
