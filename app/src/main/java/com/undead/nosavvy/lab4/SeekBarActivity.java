package com.undead.nosavvy.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SeekBarActivity extends AppCompatActivity {

    @BindView(R.id.count)
    TextView textView;
    @BindView(R.id.seekBar)
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        ButterKnife.bind(this);
        // seekBar.setProgress(2);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("Progress: " + progress + " / " + seekBar.getMax());
                Toast.makeText(getApplicationContext(),"SeekBar Progress Change",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"SeekBar Touch Started",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "SeekBar Touch Stop ", Toast.LENGTH_SHORT).show();
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
            navigate(SeekBarActivity.class);
        }else if(btn.getText().equals("VOLVER")){
            navigate(FloatingLabelsActivity.class);
        }
    }
}
