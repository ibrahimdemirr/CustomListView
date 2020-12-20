package com.ibrahimdemir.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        Country countryOne = new Country("Turkey", R.drawable.turkey);
        Country countryTwo = new Country("Argentina", R.drawable.argentina);
        Country countryThree = new Country("China", R.drawable.china);
        Country countryFour = new Country("Spain", R.drawable.spain);

        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(countryOne);
        countryList.add(countryTwo);
        countryList.add(countryThree);
        countryList.add(countryFour);

        CustomAdapter customAdapter = new CustomAdapter(countryList, MainActivity.this);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("selectedCountry", countryList.get(i));
                startActivity(intent);
            }
        });
    }
}