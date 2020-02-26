package com.example.projetmspr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.webservice.Promotion;

import java.util.ArrayList;
import java.util.List;

public class PromotionAdapter extends ArrayAdapter <Promotion> {
    public PromotionAdapter(@NonNull Context context, List<Promotion> promotion) {
        super(context,0, promotion);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Promotion promotion = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.template_listview, parent, false);
        }
        TextView textViewName = (TextView) convertView.findViewById(R.id.Nom);
        textViewName.setText(promotion.getNom());
        return convertView;
    }
}
