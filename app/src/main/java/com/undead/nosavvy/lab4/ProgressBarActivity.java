package com.undead.nosavvy.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProgressBarActivity extends AppCompatActivity {
    @BindView(R.id.progressbar1)
    ProgressBar progressbar1;
    @BindView(R.id.numberText) EditText numbertext;
    @OnClick(R.id.showButton)
    public void show(){
        int value = Integer.parseInt(numbertext.getText().toString());
        progressbar1.setProgress(value);
    }

    public void navigate(Class to){
        Intent i = new Intent(getApplicationContext(),to);
        startActivity(i);
    }

    @OnClick({R.id.next,R.id.back})
    public void click(Button btn){
        if(btn.getText().equals("SIGUIENTE")){
            navigate(DatePickerActivity.class);
        }else if(btn.getText().equals("VOLVER")){
            navigate(SpinnerActivity.class);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        ButterKnife.bind(this);
    }

}
