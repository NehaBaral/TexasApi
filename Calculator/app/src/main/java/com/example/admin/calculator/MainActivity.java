package com.example.admin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView show;
    EditText input;
    Button click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show=findViewById(R.id.displayID);
        input=findViewById(R.id.inputID);
        click=findViewById(R.id.clickID);


        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setVisibility(View.VISIBLE);
                if (input.getText().toString().equals(""))
                {
                    show.setTextColor(getResources().getColor(R.color.colorAccent));
                    show.setText(R.string.error);
                }else {
                    show.setTextColor(getResources().getColor(R.color.colorPrimary));
                    show.setText(input.getText());
                }
            }
        });


    }
}