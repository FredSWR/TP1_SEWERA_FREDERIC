package com.example.frederics.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choix extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix);

        Button boutonAnnuler = findViewById(R.id.Annuler);
        boutonAnnuler.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent boutonAnnuler = new Intent(Choix.this, MainActivity.class);
        startActivity(boutonAnnuler);
        finish();

    }
}
