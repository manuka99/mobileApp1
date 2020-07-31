package com.firstapp.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView text;

    public static final String Extra_Message = "com.firstapp.app3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.onThis);
        text = findViewById(R.id.editText);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText("Hey all");

            }
        });

    }

    public void sendMessage(View view){

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(Extra_Message, message);
        startActivity(intent);

    }

}