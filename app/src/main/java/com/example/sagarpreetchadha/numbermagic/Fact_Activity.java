package com.example.sagarpreetchadha.numbermagic;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.io.StringReader;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fact_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        int n=getIntent().getIntExtra("position" , -1) ;
        if(n==0)
        {
        final TextView textView1 = (TextView) findViewById(R.id.texter1);
        final TextView textView2 = (TextView) findViewById(R.id.texter2);
        String day = getIntent().getStringExtra("day").toString();
        String month = getIntent().getStringExtra("month").toString();
        APIInterface service = client.getService();
        Call<date_response> call = service.getfact1(month, day, true);
        call.enqueue(new Callback<date_response>() {
            @Override
            public void onResponse(Call<date_response> call, Response<date_response> response) {
                if (response.isSuccessful()) {
                    String fact = response.body().getFact();
                    String year = response.body().getYear();
                    textView1.setText(fact);
                    textView2.setText(year);
                }
            }

            @Override
            public void onFailure(Call<date_response> call, Throwable t) {
                String fact = "NA";
                String year = "NA";
                textView1.setText(fact);
                textView2.setText(year);
            }
        });

    }
        else  if(n==1)
        {
            String number=getIntent().getStringExtra("number") ;
            APIInterface service = client.getService();
            Call<date_response> call = service.getfact2(number , true);
            call.enqueue(new Callback<date_response>() {
                final TextView textView1 = (TextView) findViewById(R.id.texter1);
                final TextView textView2 = (TextView) findViewById(R.id.texter2);
                @Override
                public void onResponse(Call<date_response> call, Response<date_response> response) {
                    if (response.isSuccessful()) {
                        String fact = response.body().getFact();
                        //String year = response.body().getYear();
                        String number=response.body().getNumber() ;
                        textView1.setText(fact);
                        textView2.setText(number);
                    }
                }

                @Override
                public void onFailure(Call<date_response> call, Throwable t) {
                    String fact = "NA";
                    String year = "NA";
                    textView1.setText(fact);
                    textView2.setText(year);
                }
            });

        }
        else if (n==2)
        {
           // String number=getIntent().getStringExtra("number") ;
            APIInterface service = client.getService();
            Call<date_response> call = service.getfact3();
            call.enqueue(new Callback<date_response>() {
                final TextView textView1 = (TextView) findViewById(R.id.texter1);
                final TextView textView2 = (TextView) findViewById(R.id.texter2);
                @Override
                public void onResponse(Call<date_response> call, Response<date_response> response) {
                    if (response.isSuccessful()) {
                        String fact = response.body().getFact();
                        String number = response.body().getYear();
                        textView1.setText(fact);
                        textView2.setText(number);
                    }
                }

                @Override
                public void onFailure(Call<date_response> call, Throwable t) {
                    String fact = "NA";
                    String year = "NA";
                    textView1.setText(fact);
                    textView2.setText(year);
                }
            });

        }
        else if(n==3)
        {
            String number=getIntent().getStringExtra("number") ;
            APIInterface service = client.getService();
            Call<date_response> call = service.getfact4(number , true);
            call.enqueue(new Callback<date_response>() {
                final TextView textView1 = (TextView) findViewById(R.id.texter1);
                final TextView textView2 = (TextView) findViewById(R.id.texter2);
                @Override
                public void onResponse(Call<date_response> call, Response<date_response> response) {
                    if (response.isSuccessful()) {
                        String fact = response.body().getFact();
                        String number = response.body().getYear();
                        textView1.setText(fact);
                        textView2.setText(number);
                    }
                }

                @Override
                public void onFailure(Call<date_response> call, Throwable t) {
                    String fact = "NA";
                    String year = "NA";
                    textView1.setText(fact);
                    textView2.setText(year);
                }
            });

        }
        else if(n==4)
        {
            String number=getIntent().getStringExtra("number") ;
            APIInterface service = client.getService();
            Call<date_response> call = service.getfact5(number , true);
            call.enqueue(new Callback<date_response>() {
                final TextView textView1 = (TextView) findViewById(R.id.texter1);
                final TextView textView2 = (TextView) findViewById(R.id.texter2);
                @Override
                public void onResponse(Call<date_response> call, Response<date_response> response) {
                    if (response.isSuccessful()) {
                        String fact = response.body().getFact();
                        String number = response.body().getNumber() ;
                        String date = response.body().getDate() ;
                        textView1.setText(fact);
                        textView2.setText(number + " " + date);
                    }
                }

                @Override
                public void onFailure(Call<date_response> call, Throwable t) {
                    String fact = "NA";
                    String year = "NA";
                    textView1.setText(fact);
                    textView2.setText(year);
                }
            });

        }
    }

}
