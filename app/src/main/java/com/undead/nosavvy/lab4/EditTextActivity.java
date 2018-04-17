package com.undead.nosavvy.lab4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    private EditText firstName, lastName;
    private TextView displayname;
    private Button btn;
    private Button btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        btnnext = (Button) findViewById(R.id.next);
        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        displayname = (TextView) findViewById(R.id.displayName);
        btn = (Button) findViewById(R.id.back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ImageButtonActivity.class);
                startActivity(i);
            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CheckBoxActivity.class);
                startActivity(i);
            }
        });
    }
    public void register(View view) {
        String getFirstName = firstName.getText().toString();
        String getLastName = lastName.getText().toString();
        if(getFirstName.length() == 0 || getLastName.length() == 0)
            displayname.setText("These fields are required");
        else
            displayname.setText("Your username is " + getFirstName + " " + getLastName);
    }
}
