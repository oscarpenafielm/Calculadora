package com.uisrael.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtValor1, edtValor2;
     TextView  txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor1=(EditText)findViewById(R.id.edtValor1);
        edtValor2=(EditText)findViewById(R.id.edtValor2);
        txtResultado=(TextView) findViewById(R.id.txtResultado);
    }

    public void sumar(View view){
    int n1=Integer.parseInt(edtValor1.getText().toString());
    int n2=Integer.parseInt(edtValor2.getText().toString());
    int reslt=n1+n2;
    txtResultado.setText(String.valueOf(reslt));
    }

    public void restar(View view){
        int n1=Integer.parseInt(edtValor1.getText().toString());
        int n2=Integer.parseInt(edtValor2.getText().toString());
        int reslt=n1-n2;
        txtResultado.setText(String.valueOf(reslt));

    }

    public void multiplicar(View view){

        int n1=Integer.parseInt(edtValor1.getText().toString());
        int n2=Integer.parseInt(edtValor2.getText().toString());
        int reslt=n1*n2;
        txtResultado.setText(String.valueOf(reslt));


    }

    public void dividir(View view){
        int n1=Integer.parseInt(edtValor1.getText().toString());
        int n2=Integer.parseInt(edtValor2.getText().toString());
        int reslt=n1/n2;
        txtResultado.setText(String.valueOf(reslt));

    }

}
