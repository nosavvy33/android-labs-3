package com.undead.nosavvy.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class SwitchButtonActivity extends AppCompatActivity {
@BindView(R.id.switchButton)
Switch switchButton;
@BindView(R.id.switchButton2)
    Switch switchButton2;
@BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.textView2)
    TextView textView2;

    private final String switchOn = "Switch is ON";
    private final String switchOff = "Switch is OFF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_button);
        ButterKnife.bind(this);

    }
    @OnCheckedChanged({R.id.switchButton,R.id.switchButton2})
    public void onchecked(Switch swtbtn){
        if(swtbtn.isChecked() && swtbtn == switchButton){
            textView.setText(switchOn);
        } else {
            textView.setText(switchOff);
        }
        if(swtbtn.isChecked() && swtbtn == switchButton2){
            textView2.setText(switchOn);
        } else {
            textView2.setText(switchOff);
        }
    }
    public void navigate(Class to){
        Intent i = new Intent(getApplicationContext(),to);
        startActivity(i);
    }

    @OnClick({R.id.next,R.id.back})
    public void click(Button btn){
        if(btn.getText().equals("SIGUIENTE")){
            navigate(ToogleButtonActivity.class);
        }else if(btn.getText().equals("VOLVER")){
            navigate(RadioButtonActivity.class);
        }
    }

}