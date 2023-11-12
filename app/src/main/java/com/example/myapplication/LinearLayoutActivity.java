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
        String[] country={"Cambodia","Thai","Vietnam","China","Korea","USA","Canada"};
        List<Country> list = new ArrayList<>();
        for (String j:country)
        {
                Country cont = new Country();
                cont.setId(j.length());
                cont.setName(j);
                list.add(cont);
                CountryBaseAdapter countryBaseAdapter = new CountryBaseAdapter(list,this);
                spinner.setAdapter(countryBaseAdapter);

        }




    }
}