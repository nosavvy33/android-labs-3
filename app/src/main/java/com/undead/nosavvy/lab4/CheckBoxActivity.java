package com.undead.nosavvy.lab4;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;

public class CheckBoxActivity extends AppCompatActivity {
    // @BindView(R.id.pass) EditText password;
    @Nullable
    @BindView(R.id.next) Button next;
    @Nullable
    @BindView(R.id.back) Button back;
    @Nullable
    @BindView(R.id.checkBox) CheckBox android;
    @Nullable
    @BindView(R.id.checkBox2) CheckBox java;
    @Nullable
    @BindView(R.id.checkBox3) CheckBox xml;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        ButterKnife.bind(this);



    }

    @OnClick(R.id.next)
    public void nexting(){
        tonext();
    }
    @OnClick(R.id.back)
    public void backing(){
        toback();
    }

    public void toback(){
        Intent i = new Intent(this.getApplicationContext(), EditTextActivity.class);
        startActivity(i);
    }
    public void tonext(){
        Intent i = new Intent(this.getApplicationContext(), RadioButtonActivity.class);
        startActivity(i);
    }

    public void androidCheckBoxClicked(View view) {
        // action for checkbox click
        switch (view.getId()) {
            case R.id.checkBox:
                CheckBox checkBox = (CheckBox) view;
                if(checkBox.isChecked())
                    Toast.makeText(this, checkBox.getText() + " selected!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox2:
                if(java.isChecked()){
                    Toast.makeText(this, java.getText() + " selected!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox3:
                if(xml.isChecked()){
                    Toast.makeText(this, xml.getText() + " selected!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox4:
                CheckBox cb = (CheckBox) view;
                if(cb.isChecked())
                    Toast.makeText(this, cb.getText().charAt(0)+"."+cb.getText().charAt(1)+"."+cb.getText().charAt(2)+"." + " selected!", Toast.LENGTH_LONG).show();

                break;
            case R.id.checkBox5:
                //DO something when user check the box
                break;
            case R.id.checkBox6:
                //DO something when user check the box
                break;
            case R.id.checkBox7:
                //DO something when user check the box
                break;
            case R.id.checkBox8:
                //DO something when user check the box
                break;
            case R.id.checkBox9:
                //DO something when user check the box
                break;
            default:
                Toast.makeText(this, "Checkbox seleccionado", Toast.LENGTH_LONG).show();

        }
    }
}
