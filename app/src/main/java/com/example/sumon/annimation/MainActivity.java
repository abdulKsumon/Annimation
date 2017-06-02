package com.example.sumon.annimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView img1;
    private ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = (ImageView) findViewById(R.id.img1ImageView);
        img2 = (ImageView) findViewById(R.id.img2imageView2);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);

    }
//    public void hideimage(View view){
//        view.animate().alpha(0f).setDuration(2000);
//    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.img1ImageView) {
            img1.animate().alpha(0f).setDuration(2000);
            img2.animate().alpha(1f).setDuration(2000);

        }
        if (view.getId() == R.id.img2imageView2) {

            img2.animate().alpha(0f).setDuration(2000);
            img1.animate().alpha(1f).setDuration(2000);

        }
    }
}
