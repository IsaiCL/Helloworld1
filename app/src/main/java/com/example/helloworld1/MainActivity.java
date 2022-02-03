package com.example.helloworld1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnT;         //Declaro objeto boton
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionar el boton del XML con mi objeto
        btnT = findViewById(R.id.btnToast);

        //Agrego Listener para este boton
        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Al hacer click
                Toast.makeText(MainActivity.this, "Presiono el botón TOAST",Toast.LENGTH_LONG).show();
            }
        });
    }
}