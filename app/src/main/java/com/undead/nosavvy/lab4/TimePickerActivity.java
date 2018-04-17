package com.undead.nosavvy.lab4;

import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TimePickerActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView displayTime;
    @BindView(R.id.timePicker)
    TimePicker timePicker;

    @OnClick(R.id.bchange_time)
    public void pick(View view){
        displayTime.setText("Picked: " + timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        ButterKnife.bind(this);
        timePicker.setIs24HourView(true);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                displayTime.setText("Time: " + hourOfDay + ":" + minute);
            }
        });

    }

    public void navigate(Class to){
        Intent i = new Intent(getApplicationContext(),to);
        startActivity(i);
    }

    @OnClick({R.id.next,R.id.back})
    public void click(Button btn){
        if(btn.getText().equals("SIGUIENTE")){
            navigate(FloatingActionButtonActivity.class);
        }else if(btn.getText().equals("VOLVER")){
            navigate(Geolocalizacion.class);
        }
    }
}
