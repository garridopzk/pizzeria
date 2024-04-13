package com.example.pizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    Button Menu;
    Button Refrescos;
    EditText ingresar1;
    EditText introducir;
    EditText introducirtexto;
    private int numPizzas = 0;
    private int totalapagar = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        Menu=findViewById(R.id.menu);

        Refrescos=findViewById(R.id.refrescos);

        ingresar1=findViewById(R.id.ingresar1);

        introducir=findViewById(R.id.ingresar2);

        introducirtexto=findViewById(R.id.ingresar3);

        numPizzas = 0;

        totalapagar = 0;

        EditText pizzaQueso = findViewById(R.id.ingresar1);
        pizzaQueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numPizzas++;
                totalapagar += 150;

                ingresar1.setText(String.valueOf(numPizzas));
                ingresar1.setText(String.valueOf(totalapagar));
            }
        });

        EditText PizzaHawallana = findViewById(R.id.ingresar2);
        PizzaHawallana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numPizzas++;
                totalapagar +=120;

                introducir.setText(String.valueOf(numPizzas));
                introducir.setText(String.valueOf(totalapagar));
            }
        });

        EditText pizzapedepeperoni = findViewById(R.id.ingresar3);
        pizzapedepeperoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numPizzas++;
                totalapagar +=190;

                introducirtexto.setText(String.valueOf(numPizzas));
                introducirtexto.setText(String.valueOf(totalapagar));
            }
        });
        ingresar1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int numpizzas, int totalapagar, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    numPizzas= Integer.parseInt(s.toString());
                }catch (NumberFormatException e){
                    numPizzas=0;
                }

            }

             @Override
             public void afterTextChanged(Editable s) {
            }
        });
        introducir.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    totalapagar= Integer.parseInt(s.toString());
                }catch (NumberFormatException e){
                    totalapagar=0;
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });
        Refrescos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }

}