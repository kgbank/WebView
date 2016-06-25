package com.example.user.myappwebview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 2016-06-25.
 */
public class ArrAdapter extends android.widget.ArrayAdapter<String> {
    private final Context context;
    private String[] values;

    public ArrAdapter(Context context, String[] values) {
        super(context, R.layout.activity_list, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_list, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);
        String s = values[position];

        switch (s){
            case "donut" : imageView.setImageResource(R.drawable.cupcake);break;
            case "eclair" : imageView.setImageResource(R.drawable.eclair); break;
            case "froyo" : imageView.setImageResource(R.drawable.froyo);  break;
            case "gingerbread" : imageView.setImageResource(R.drawable.gingerbread); break;
            case "honeycomb" : imageView.setImageResource(R.drawable.honeycomb); break;
            case "icecream" : imageView.setImageResource(R.drawable.icecream); break;
            case "jellybean" : imageView.setImageResource(R.drawable.jellybean); break;
        }
        return rowView;
    }
}
