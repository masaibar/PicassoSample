package com.masaibar.picassosample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    static final String IMAGE_URL = "https://sdl-stickershop.line.naver.jp/products/0/0/1/6742/android/stickers/12127494.png";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.image);

        Picasso.with(getApplicationContext()).setIndicatorsEnabled(true);
        Picasso.with(getApplicationContext()).load(IMAGE_URL).into(imageView);
    }
}
