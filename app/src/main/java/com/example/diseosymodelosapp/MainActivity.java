package com.example.diseosymodelosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        loadImage();



    }

    private void initWidgets() {
        iv_avatar=findViewById(R.id.iv_logo);
    }

    private void loadImage() {
        Picasso.get()
                .load("https://e7.pngegg.com/pngimages/462/369/png-clipart-uzumaki-naruto-naruto-throwing-ball-comics-and-fantasy-naruto.png")
                .into(iv_avatar);



    }
}