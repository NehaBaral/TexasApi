package com.example.admin.texasapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText un, pw;
    Button ln,sn;
    TextView hint, view;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        un= findViewById(R.id.username);
        pw= findViewById(R.id.password);
        ln= findViewById(R.id.login);
        sn= findViewById(R.id.signin);
        view= findViewById(R.id.view);
        hint= findViewById(R.id.hint);
        img= findViewById(R.id.image);


    }
}
