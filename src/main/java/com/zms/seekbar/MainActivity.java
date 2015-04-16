package com.zms.seekbar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.zms.seekbar.library.Slider;


public class MainActivity extends Activity {
    private Slider slider, sliderNumber;
    private TextView textProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int color = Color.parseColor("#1E88E5");
        slider = (Slider) findViewById(R.id.slider);
        slider.setBackgroundColor(color);
        slider.setMin(0);
        slider.setMax(50);

        sliderNumber = (Slider) findViewById(R.id.sliderNumber);
        sliderNumber.setBackgroundColor(color);
        sliderNumber.setShowNumberIndicator(true);
        sliderNumber.setMin(0);
        sliderNumber.setMax(50);
        sliderNumber.setOnValueChangedListener(new MyOnValueChangedListener());

        textProgress = (TextView) findViewById(R.id.textProgress);

    }

    class MyOnValueChangedListener implements Slider.OnValueChangedListener {

        @Override
        public void onValueChanged(int value) {
            textProgress.setText("Progress:" + value);
        }
    }

}
