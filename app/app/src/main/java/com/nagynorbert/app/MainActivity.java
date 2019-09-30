package com.nagynorbert.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNev;
    private TextView textViewHello;
    private Button buttonOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nev = editTextNev.getText().toString();
                textViewHello.setText("Hello: "+ nev);
            }
        });

    }

    private void init() {
        editTextNev = findViewById(R.id.editTextNev);
        textViewHello = findViewById(R.id.textViewHello);
        buttonOK = findViewById(R.id.button01);
    }
}