package com.undead.nosavvy.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FloatingLabelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_labels);
        ButterKnife.bind(this);
    }
    public void navigate(Class to){
        Intent i = new Intent(getApplicationContext(),to);
        startActivity(i);
    }

    @OnClick({R.id.next,R.id.back})
    public void click(Button btn){
        if(btn.getText().equals("SIGUIENTE")){
            navigate(SeekBarActivity.class);
        }else if(btn.getText().equals("VOLVER")){
            navigate(FloatingActionButtonActivity.class);
        }
    }
}
