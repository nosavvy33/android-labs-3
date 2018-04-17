package com.undead.nosavvy.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RadioButtonActivity extends AppCompatActivity {
    @BindView(R.id.radioGroup)
    RadioGroup radioGroup;
    @BindView(R.id.dsplayText)
    TextView dsplayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        ButterKnife.bind(this);
    }
    public void radioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // This check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    //Do something when radio button is clicked
                    Toast.makeText(getApplicationContext(), "It seems like you feeal RelativeLayout easy", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton2:
                //Do something when radio button is clicked
                Toast.makeText(getApplicationContext(), "It seems like you feel LinearLayout easy", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton3:
                //Do something when radio button is clicked
                Toast.makeText(getApplicationContext(), "It seems like you feel FrameLayout easy", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton4:
                //Do something when radio button is clicked
                Toast.makeText(getApplicationContext(), "It seems like you feel TablleLayout easy", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton5:
                //Do something when radio button is clicked
                Toast.makeText(getApplicationContext(), "It seems like you feel GridLayout easy", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void answer(View view){
        int radioButtonId = radioGroup.getCheckedRadioButtonId();
        if (radioButtonId == -1){
            Toast.makeText(this, "This field is required!", Toast.LENGTH_LONG).show();
        }
        else{
            // Individual selected
            if (radioButtonId == R.id.radioButton1){
                Toast.makeText(this, "You selected RelativeLayout", Toast.LENGTH_SHORT).show();
            }else if (radioButtonId == R.id.radioButton2){
                Toast.makeText(this, "You selected LinearLayout", Toast.LENGTH_SHORT).show();
            }//...

            // Dinamic selected
            RadioButton radioButton = (RadioButton) findViewById(radioButtonId);
            Toast.makeText(this, "This text is " + radioButton.getText(), Toast.LENGTH_SHORT).show();
        }
    }
    public void navigate(Class to){
        Intent i = new Intent(getApplicationContext(),to);
        startActivity(i);
    }

    @OnClick({R.id.next,R.id.back})
    public void click(Button btn){
        if(btn.getText().equals("SIGUIENTE")){
            navigate(SwitchButtonActivity.class);
        }else if(btn.getText().equals("VOLVER")){
            navigate(CheckBoxActivity.class);
        }
    }
}
