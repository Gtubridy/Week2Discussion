package com.mastercoding.week2discussion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    Button myBtn;

    TextView Title;

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        myBtn = findViewById(R.id.btn);
        Title = findViewById(R.id.title);
        image = findViewById(R.id.imageView);
        image.setImageResource(R.drawable.droid);


        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = editText.getText().toString();

                Toast.makeText(MainActivity.this, "Welcome " + inputName + " to our App", Toast.LENGTH_SHORT).show();
            }
        });

    }
}