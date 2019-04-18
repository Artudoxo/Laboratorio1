package com.cupsoft.laboratorio1;

import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText txt1, txt2;
    Button btncalcular, btnrestar, btnmultiplicar, btndividir;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        btncalcular = findViewById(R.id.btncalcular);
        btndividir = findViewById(R.id.btndividir);
        btnmultiplicar = findViewById(R.id.btnmultiplicar);
        btnrestar = findViewById(R.id.btnrestar);
        resultado = findViewById(R.id.resultado);
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(txt1.getText().toString());
                int valor2 = Integer.parseInt(txt2.getText().toString());
                float res = valor1 + valor2;
                resultado.setText("La suma es: " + res);
            }
        });
        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(txt1.getText().toString());
                int valor2 = Integer.parseInt(txt2.getText().toString());
                float res = valor1 - valor2;
                resultado.setText("La resta es: " + res);
            }
        });
        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(txt1.getText().toString());
                int valor2 = Integer.parseInt(txt2.getText().toString());
                float res = valor1 * valor2;
                resultado.setText("La multiplicación es: " + res);
            }
        });

        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(txt1.getText().toString());
                int valor2 = Integer.parseInt(txt2.getText().toString());
                float res = valor1 / valor2;
                resultado.setText("La división es es: " + res);
            }
        });

    }



}
