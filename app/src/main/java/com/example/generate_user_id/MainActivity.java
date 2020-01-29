package com.example.generate_user_id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generate(View v){
        EditText input1 = (EditText)findViewById(R.id.inputFirstName);
        String fname = input1.getText().toString();
        EditText input2 = (EditText)findViewById(R.id.inputLastName);
        String lname = input2.getText().toString();
        EditText input3 = (EditText)findViewById(R.id.inputDOB);
        String dob = input3.getText().toString();

        TextView upUserId = (TextView)findViewById(R.id.outPutUserId);
        TextView upPassword = (TextView)findViewById(R.id.outputPassword);

        GenerateUserId gen = new GenerateUserId(fname, lname, dob);

        upUserId.setText(gen.generateUserId());
        upPassword.setText(gen.generatePassword());
    }
}
