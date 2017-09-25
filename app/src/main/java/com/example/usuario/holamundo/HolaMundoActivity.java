package com.example.usuario.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Mi primera aplicacion de Android
 * @author Alejandro Galvez
 * @version 1.0
 * @see android.app.Activity
 */


public class HolaMundoActivity extends AppCompatActivity {

    private TextView txvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);
        txvMessage=(TextView) findViewById(R.id.txvMessage);
        txvMessage.setText(("Al final no"));

    }
}
