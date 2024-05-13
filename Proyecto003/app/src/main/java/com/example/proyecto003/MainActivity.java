package com.example.proyecto003;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private RadioButton r1, r2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        r1=findViewById(R.id.rb1);
        r2=findViewById(R.id.rb2);
        tv1=findViewById(R.id.tv1);
    }

    public void operar(View v){
        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        int v1=Integer.parseInt(s1);
        int v2=Integer.parseInt(s2);
        if (r1.isChecked())
        {
            int suma=v1+v2;
            tv1.setText("la suma es:"+suma);
        }
        else
            if (r2.isChecked())
            {
                int resta=v2-v1;
                tv1.setText("La resta es:"+resta);
            }
    }

}