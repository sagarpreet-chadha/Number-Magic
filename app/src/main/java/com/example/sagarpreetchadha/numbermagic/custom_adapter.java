package com.example.sagarpreetchadha.numbermagic;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.sagarpreetchadha.numbermagic.R.drawable.day;

/**
 * Created by sagarpreet chadha on 05-07-2016.
 */
public class custom_adapter extends ArrayAdapter<String>{
    Context mcontext ;
    public custom_adapter(Context context) {
        super(context , 0);
        mcontext=context ;
    }

    @Override
    public int getCount() {
        return 5 ;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        View v=convertView ;
//        if(v==null)
//
           View v= LayoutInflater.from(mcontext).inflate(R.layout.list_view , parent , false) ;
        ImageView imageview=(ImageView)v.findViewById(R.id.imageview) ;
        TextView textView=(TextView)v.findViewById(R.id.texter) ;
        if(position==0)
        {
            imageview.setImageResource(R.drawable.day);
            String x="Fact About Date"  ;
            textView.setText(x);
        }
        else if(position==1)
        {
            imageview.setImageResource(R.drawable.math);
            String x="Math Fact" ;
            textView.setText(x);
        }

        else if(position==2)
        {
            imageview.setImageResource(R.drawable.random);
            String x="Random Fact" ;
            textView.setText(x);
        }

        else if(position==3)
        {
            imageview.setImageResource(R.drawable.trivia);
            String x="Trivia Fact about number" ;
            textView.setText(x);
        }

        else if(position==4)
        {
            imageview.setImageResource(R.drawable.year);
            String x="Fact About Year" ;
            textView.setText(x);
        }
    return  v ;

    }
}
