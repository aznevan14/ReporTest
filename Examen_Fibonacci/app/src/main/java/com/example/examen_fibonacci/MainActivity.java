package com.example.examen_fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import com.example.examen_fibonacci.R;



public class MainActivity extends AppCompatActivity {
  private int sFibonacci = 0;
  private int a = 0;
  private int b = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btnIncremento = findViewById(R.id.btnIncremento);
       Button btnDecremento = findViewById(R.id.btnDecremento);

        btnIncremento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sFibonacci = nuevoFibonacci();
                Toast.makeText(MainActivity.this, "Fibonacci: " + sFibonacci, Toast.LENGTH_SHORT).show();
            }
        });

        btnDecremento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sFibonacci = previoFibonacci();
                Toast.makeText(MainActivity.this, "Fibonacci: " + sFibonacci, Toast.LENGTH_SHORT).show();
            }
        });

private int nuevoFibonacci(){
    int temp = a + b;
     a = b;
    b = temp;
    return b;
}
private int previoFibonacci() {

    int temp = b - a;
    b = a;
    a = temp;
    return b;
    }
}
