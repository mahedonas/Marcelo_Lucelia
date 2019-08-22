package br.com.etecia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class JanelaDois_Activity extends AppCompatActivity {

    Button btnvoltarjanela1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_dois_layout);

        btnvoltarjanela1 = (Button) findViewById(R.id. btnVoltarJanela1);



    }
}
