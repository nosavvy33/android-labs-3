package com.undead.nosavvy.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class ToogleButtonActivity extends AppCompatActivity {
    public final String ON = "ToggleButton is ON";
    public final String OFF = "ToggleButton is OFF";
    @BindView(R.id.toggleButton1) ToggleButton toggleButton1;
    @BindView(R.id.toggleButton2) ToggleButton toggleButton2;
    @BindView(R.id.text_view1) TextView textView1;
    @BindView(R.id.text_view2)
    TextView textView2;
    @OnCheckedChanged({R.id.toggleButton1,R.id.toggleButton2})
    public void changed(ToggleButton tgbtn){
        if(tgbtn == toggleButton1 && tgbtn.isChecked()){
            textView1.setText(ON);
        }else if(tgbtn == toggleButton1 && !tgbtn.isChecked()){
            textView1.setText(OFF);
        }else if(tgbtn == toggleButton2 && tgbtn.isChecked()){
            textView2.setText(ON);
        }else if(tgbtn == toggleButton2 && !tgbtn.isChecked()){
            textView2.setText(OFF);
        }
    }
    public void navigate(Class to){
        Intent i = new Intent(getApplicationContext(),to);
        startActivity(i);
    }

    @OnClick({R.id.next,R.id.back})
    public void click(Button btn){
        if(btn.getText().equals("SIGUIENTE")){
            navigate(RatingBarActivity.class);
        }else if(btn.getText().equals("VOLVER")){
            navigate(SwitchButtonActivity.class);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toogle_button);
        ButterKnife.bind(this);
        /*toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);

        textView1 = (TextView) findViewById(R.id.text_view1);
        textView2 = (TextView) findViewById(R.id.text_view2);

        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    textView1.setText("ToggleButton is ON");
                } else {
                    textView1.setText("ToggleButton is OFF");
                }
            }
        });

        toggleButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    textView2.setText("ToggleButton is ON");
                } else {
                    textView2.setText("ToggleButton is OFF");
                }
            }
        });

        if (toggleButton1.isChecked()) {
            textView1.setText("ToggleButton is ON");
        } else {
            textView1.setText("ToggleButton is OFF");
        }

        if (toggleButton2.isChecked()) {
            textView2.setText("ToggleButton is ON");
        } else {
            textView2.setText("ToggleButton is OFF");
        }*/
    }
}
