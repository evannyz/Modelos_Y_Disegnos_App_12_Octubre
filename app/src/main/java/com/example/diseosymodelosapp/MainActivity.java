package com.example.diseosymodelosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView ivAvatarSuperior,ivAvatarInferior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initWidgets();
        loadImage();
        loadImageGlide();



    }

    private void loadImageGlide() {
        Glide.with(this)
                .load("https://smallimg.pngkey.com/png/small/127-1271587_one-piece-v2-icon-anime-one-piece.png")
                .into(ivAvatarInferior);
    }

    private void initWidgets() {
        ivAvatarSuperior =findViewById(R.id.iv_logo);
        ivAvatarInferior =findViewById(R.id.iv_logo_inferior);
    }

    private void loadImage() {
        Picasso.get()
                .load("https://e7.pngegg.com/pngimages/462/369/png-clipart-uzumaki-naruto-naruto-throwing-ball-comics-and-fantasy-naruto.png")
                .into(ivAvatarSuperior);



    }
}