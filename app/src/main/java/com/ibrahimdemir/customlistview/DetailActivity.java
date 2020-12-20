package com.ibrahimdemir.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public ImageView countryImage;
    public TextView countryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        countryImage = findViewById(R.id.countryImage);
        countryName = findViewById(R.id.countryName);

        Intent intent = getIntent();
        Country selectedCountry = (Country) intent.getSerializableExtra("selectedCountry");

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), selectedCountry.getPictureId());
        countryImage.setImageBitmap(bitmap);

        countryName.setText(selectedCountry.getName());
    }
}