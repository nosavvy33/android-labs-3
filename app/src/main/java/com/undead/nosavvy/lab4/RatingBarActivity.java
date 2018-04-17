package com.undead.nosavvy.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RatingBarActivity extends AppCompatActivity {

    @BindView(R.id.ratingBar) RatingBar ratingBar;
    @BindView(R.id.ratingDisplay) TextView rateDisplay;
    @OnClick(R.id.ratingSubmitButton)
    public void show(){
        rateDisplay.setText("Rating : "+String.valueOf(ratingBar.getRating()));
    }
    public void navigate(Class to){
        Intent i = new Intent(getApplicationContext(),to);
        startActivity(i);
    }

    @OnClick({R.id.next,R.id.back})
    public void click(Button btn){
        if(btn.getText().equals("SIGUIENTE")){
            navigate(SpinnerActivity.class);
        }else if(btn.getText().equals("VOLVER")){
            navigate(ToogleButtonActivity.class);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        ButterKnife.bind(this);

    }


}
