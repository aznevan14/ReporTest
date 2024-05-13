package com.example.ejercicioboton;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        }
        public void presionarB(View v){
            this.v = v;
            Toast.makeText(this, "Se presiono el boton", Toast.LENGTH_LONG).show();
        }
    }
