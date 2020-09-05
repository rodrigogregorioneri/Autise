package com.example.autise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class TerceiraEtapaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_etapa);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button b1 = (Button) findViewById(R.id.login24);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(TerceiraEtapaActivity.this, SegundaEtapaActivity.class);
                startActivity(it);


            }
        });


    }
}