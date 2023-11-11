package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.Models.Country;
import com.example.myapplication.R;

import java.util.List;

public class CountryBaseAdapter extends BaseAdapter {
    List<Country> countries;
    Context context;

    public CountryBaseAdapter(List<Country> countries, Context context) {
        this.countries = countries;
        this.context = context;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int i) {
        return countries.get(i);
    }

    @Override
    public long getItemId(int i) {
        return countries.get(i).getId();
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View currentView = LayoutInflater.from(context).inflate(R.layout.spiner_item_layout,null,true );
        TextView title=currentView.findViewById(R.id.title);
        title.setText(countries.get(i).getName());
        return currentView;
    }
}
