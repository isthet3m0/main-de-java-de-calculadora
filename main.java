package com.example.applecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtNum1;
    private EditText txtNum2;
    private TextView tvres2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        tvres2 = findViewById(R.id.tvres2);
    }
    public void sumar (View view) {
        if(txtNum1.getText().toString().isEmpty() && txtNum2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Debes ingrear todos los numeros", Toast.LENGTH_LONG).show();
        }else if (txtNum2.getText().toString().isEmpty()) {
            Toast.makeText( this, "El segundo campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else if(txtNum1.getText().toString().isEmpty()) {
            Toast.makeText(this, "El primer campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else {
            int valor1 = Integer.parseInt(txtNum1.getText().toString());
            int valor2 = Integer.parseInt(txtNum2.getText().toString());

            int sumar= valor1 + valor2;

            String res = String.valueOf(sumar);
            tvres2.setText(res);
        }
    }
    public void restar (View view) {
        if(txtNum1.getText().toString().isEmpty() && txtNum2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Debes ingrear todos los numeros", Toast.LENGTH_LONG).show();
        }else if (txtNum2.getText().toString().isEmpty()) {
            Toast.makeText( this, "El segundo campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else if(txtNum1.getText().toString().isEmpty()) {
            Toast.makeText(this, "El primer campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else {
            int valor1 = Integer.parseInt(txtNum1.getText().toString());
            int valor2 = Integer.parseInt(txtNum2.getText().toString());

            int resta= valor1 - valor2;

            String res = String.valueOf(resta);
            tvres2.setText(res);
        }
    }
    public void dividir (View view) {
        if(txtNum1.getText().toString().isEmpty() && txtNum2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Debes ingrear todos los numeros", Toast.LENGTH_LONG).show();
        }else if (txtNum2.getText().toString().isEmpty()) {
            Toast.makeText( this, "El segundo campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else if(txtNum1.getText().toString().isEmpty()) {
            Toast.makeText(this, "El primer campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else {
            int valor1 = Integer.parseInt(txtNum1.getText().toString());
            int valor2 = Integer.parseInt(txtNum2.getText().toString());

            int dividir= valor1 / valor2;

            String res = String.valueOf(dividir);
            tvres2.setText(res);
        }
    }
    public void multiplicacion (View view) {
        if(txtNum1.getText().toString().isEmpty() && txtNum2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Debes ingrear todos los numeros", Toast.LENGTH_LONG).show();
        }else if (txtNum2.getText().toString().isEmpty()) {
            Toast.makeText( this, "El segundo campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else if(txtNum1.getText().toString().isEmpty()) {
            Toast.makeText(this, "El primer campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else {
            int valor1 = Integer.parseInt(txtNum1.getText().toString());
            int valor2 = Integer.parseInt(txtNum2.getText().toString());

            int multi= valor1 * valor2;

            String res = String.valueOf(multi);
            tvres2.setText(res);
        }
    }
}
