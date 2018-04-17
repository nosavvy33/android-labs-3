package com.undead.nosavvy.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.OnItemSelected;

public class SpinnerActivity extends AppCompatActivity {

    @BindView(R.id.spinner)
    Spinner spinner1;
    @OnItemSelected(R.id.spinner)
    public void selected(AdapterView<?> parent, View view, int pos, long id){
        Toast.makeText(parent.getContext(),"Seleccionó : "+ parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn)
    public void click (){
        String item = (String)spinner1.getSelectedItem();
        Toast.makeText(this,"Seleccionó : "+item,Toast.LENGTH_SHORT).show();
    }

    public void navigate(Class to){
        Intent i = new Intent(getApplicationContext(),to);
        startActivity(i);
    }

    @OnClick({R.id.next,R.id.back})
    public void click(Button btn){
        if(btn.getText().equals("SIGUIENTE")){
            navigate(ProgressBarActivity.class);
        }else if(btn.getText().equals("VOLVER")){
            navigate(RatingBarActivity.class);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        ButterKnife.bind(this);
    }
}
