package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.myapplication.Models.Country;
import com.example.myapplication.adapters.CountryBaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class LinearLayoutActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        spinner= findViewById(R.id.spinnerCountry);
//        String[] countries={"Cambodia","Thai","Vietnam","China","Korea","USA","Canada"};
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,countries);
//        spinner.setAdapter(arrayAdapter);
        List<Country> list = new ArrayList<>();
        Country cambodia= new Country();
        cambodia.setId(1);
        cambodia.setName("Cambodia");
        Country china= new Country();
        list.add(cambodia);

        china.setId(2);
        china.setName("China");
        list.add(china);
        CountryBaseAdapter countryBaseAdapter = new CountryBaseAdapter(list,this);
        spinner.setAdapter(countryBaseAdapter);


    }
}