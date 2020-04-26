package com.example.vmac.WatBot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Selfcare extends AppCompatActivity {


    Button helpbtn,copingbtn,infobtn,personalbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfcare);


        helpbtn=findViewById(R.id.helpbtn);
        copingbtn=findViewById(R.id.copingbtn);
        infobtn=findViewById(R.id.infobtn);
        personalbtn=findViewById(R.id.personalbtn);

        helpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Selfcare.this,help.class);
                startActivity(intent);
            }
        });

        copingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Selfcare.this,coping.class);
                startActivity(intent);
            }
        });

        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Selfcare.this,information.class);
                startActivity(intent);
            }
        });

        personalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Selfcare.this,personal.class);
                startActivity(intent);
            }
        });
    }
}
