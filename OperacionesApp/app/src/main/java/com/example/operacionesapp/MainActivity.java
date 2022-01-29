package com.example.operacionesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private static final String EMPTY = "";
    private EditText txtNumber;
    private EditText txtNumber2;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumber = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);
        lblResultado = findViewById(R.id.lblResultado);
    }

    public void process(View view){
        MaterialButton sender = (MaterialButton) view;
        String number1 = txtNumber.getText().toString();
        String number2 = txtNumber2.getText().toString();
        try {
           if (number1.equals(EMPTY) || number2.equals(EMPTY)){
               throw new Exception("Empty fields");
           }
           double n1 = Double.parseDouble(number1);
           double n2 = Double.parseDouble(number2);
           double r = 0.0;
            CharSequence text = sender.getText();
            if (getString(R.string.PLUS).equals(text)) {
                r = n1 + n2;
            } else if (getString(R.string.MINUS).equals(text)) {
                r = n1 - n2;
            } else if (getString(R.string.MULTIPLY).equals(text)) {
                r = n1 * n2;
            } else if (getString(R.string.DIVISION).equals(text)) {
                r = n1 / n2;
            }
            lblResultado.setText("Resultado: " + n1 + " " + text + " " + n2 + " = " + r);
            txtNumber.setText("");
            txtNumber2.setText("");
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Ingrese numeros validos",Toast.LENGTH_LONG).show();
        }
    }

}