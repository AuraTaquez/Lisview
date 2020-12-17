package com.example.listviewwithapirestdata.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.listviewwithapirestdata.Model.Countri;
import com.example.listviewwithapirestdata.R;

import java.util.ArrayList;

public  class AdaptadorPaises extends ArrayAdapter<Countri> {

    public AdaptadorPaises(Context context, ArrayList<Countri> datos) {
        super(context, R.layout.ly_item, datos);
}
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.ly_item, null);

        TextView lblNombre = (TextView)item.findViewById(R.id.lblNombre);
        TextView lblCountryCode = (TextView)item.findViewById(R.id.lblCountryCode);
        TextView lblDate = (TextView)item.findViewById(R.id.lblDate);
        TextView lblSlug = (TextView)item.findViewById(R.id.lblslug);
        lblNombre.setText(getItem(position).getCountry());
        lblCountryCode.setText(getItem(position).getCountryCode());
        lblDate.setText(getItem(position).getDate());
        lblSlug.setText(getItem(position).getSlug());
        return(item);
}

}
