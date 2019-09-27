package com.example.calculadora;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Calculadora proceso;

    EditText caja1;
    EditText caja2;
    Button btnSuma;
    Button btnResta;
    Button btnMultiplicacion;
    Button btnDivision;
    TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proceso= new Calculadora();

        caja1 = (EditText) findViewById(R.id.et_numa);
        caja2 = (EditText) findViewById(R.id.et_numb);

        tvresultado = (TextView) findViewById(R.id.tv_resultado);

        btnSuma=(Button) findViewById(R.id.bt_suma);
        btnResta=(Button) findViewById(R.id.bt_resta);
        btnMultiplicacion=(Button) findViewById(R.id.bt_multiplicacion);
        btnDivision=(Button) findViewById(R.id.bt_division);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ObtenerDatos();

              tvresultado.setText(String.valueOf(proceso.Sumar()));


               
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObtenerDatos();

                tvresultado.setText(String.valueOf(proceso.Restar()));

            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObtenerDatos();

                tvresultado.setText(String.valueOf(proceso.Multiplicar()));
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObtenerDatos();
                tvresultado.setText(String.valueOf(proceso.Dividir()));
            }
        });

    }
7
    private void ObtenerDatos(){
        proceso.setNumA((Integer.parseInt(caja1.getText().toString())));
        proceso.setNumA((Integer.parseInt(caja2.getText().toString())));


    }
}
