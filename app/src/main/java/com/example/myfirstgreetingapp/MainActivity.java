package com.example.myfirstgreetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView title;
    EditText editText;
    Button myBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);
        editText = findViewById(R.id.editText);
        myBtn = findViewById(R.id.btn);

        //Adding the Functionalities
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName = editText.getText().toString();
                Toast.makeText(MainActivity.this,
                        "WelCome To " + inputName + " My First App", Toast.LENGTH_SHORT).show();
            }
        });

    }
}