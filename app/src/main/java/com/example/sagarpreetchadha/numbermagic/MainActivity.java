package com.example.sagarpreetchadha.numbermagic;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Liked The APP ? RATE US <3", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                AlertDialog.Builder db=new AlertDialog.Builder(MainActivity.this);
                db.setTitle("Liked The App ? ");

                db.setMessage("Rate us on App Store !!") ;
                final View v=getLayoutInflater().inflate(R.layout.rateus_view , null) ;
                //TextView t=(TextView) v.findViewById(R.id.textView) ;
               // t.setText("Enter Year :");
                db.setView(v) ;
                db.setPositiveButton("Continue To App Store ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss() ;
                    }
                });
                db.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss() ;
                    }
                });
                db.create().show();
            }
        });

        listView=(ListView)findViewById(R.id.listView) ;
    custom_adapter adapter=new custom_adapter(this) ;
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                if(position==0)
                {
                    AlertDialog.Builder db=new AlertDialog.Builder(MainActivity.this);
                    db.setTitle("Add Day and Month :");

                    //db.setMessage("Press NO to continue to main screen without adding .") ;
                    final View v=getLayoutInflater().inflate(R.layout.date_db , null) ;
                    db.setView(v) ;

                    db.setPositiveButton("Get Fact", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            EditText editText1 , editText2 ;
                            editText1=(EditText)v.findViewById(R.id.editText1) ;
                            editText2=(EditText)v.findViewById(R.id.editText2) ;
                            String day=editText1.getText().toString() ;
                            String month=editText2.getText().toString() ;
                            Intent i=new Intent() ;
                            i.putExtra("day" , day) ;
                            i.putExtra("month" , month) ;
                            i.putExtra("position" , 0) ;
                            i.setClass(MainActivity.this , Fact_Activity.class) ;
                            startActivity(i);

                        }
                    });
                    db.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.dismiss() ;
                        }
                    });
                    db.create().show();

                }
                else  if(position==1)
                {
                    AlertDialog.Builder db=new AlertDialog.Builder(MainActivity.this);
                    db.setTitle("OMG Fact ");

                    //db.setMessage("Press NO to continue to main screen without adding .") ;
                    final View v=getLayoutInflater().inflate(R.layout.singletextview , null) ;
                    TextView t=(TextView)v.findViewById(R.id.textView) ;
                    t.setText("Enter Number :");
                    db.setView(v) ;
                    db.setPositiveButton("Get Fact", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                              Intent i=new Intent() ;
                                EditText e=(EditText)v.findViewById(R.id.editText) ;
                            String number=e.getText().toString() ;
                            i.putExtra("number" , number) ;
                            i.putExtra("position" , 1) ;
                            i.setClass(MainActivity.this , Fact_Activity.class) ;
                            startActivity(i);

                           // finish();
                        }
                    });
                    db.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
//                            finish();
                        }
                    });
                    db.create().show();

                }
                else  if(position==2)
                {
                    Intent i=new Intent() ;
                   // EditText e=(EditText)v.findViewById(R.id.editText) ;
                    //String number=e.getText().toString() ;
                    //i.putExtra("number" , number) ;
                    i.putExtra("position" , 2) ;
                    i.setClass(MainActivity.this , Fact_Activity.class) ;
                    startActivity(i);


                }
                else  if(position==3)
                {
                    AlertDialog.Builder db=new AlertDialog.Builder(MainActivity.this);
                    db.setTitle("OMG Fact ");

                    //db.setMessage("Press NO to continue to main screen without adding .") ;
                    final View v=getLayoutInflater().inflate(R.layout.singletextview , null) ;
                    TextView t=(TextView) v.findViewById(R.id.textView) ;
                    t.setText("Enter Number :");
                    db.setView(v) ;
                    db.setPositiveButton("Get Fact", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                              Intent i=new Intent() ;

                            EditText e=(EditText)v.findViewById(R.id.editText) ;
                            String number=e.getText().toString() ;
                            i.putExtra("number" , number);
                            i.putExtra("position" , 3);
                            i.setClass(MainActivity.this , Fact_Activity.class) ;
                            startActivity(i);
                        }
                    });
                    db.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    db.create().show();

                }
                else  if(position==4)
                {
                    AlertDialog.Builder db=new AlertDialog.Builder(MainActivity.this);
                    db.setTitle("OMG Fact !! ");

                    //db.setMessage("Press NO to continue to main screen without adding .") ;
                   final View v=getLayoutInflater().inflate(R.layout.singletextview , null) ;
                    TextView t=(TextView) v.findViewById(R.id.textView) ;
                    t.setText("Enter Year :");
                    db.setView(v) ;
                    db.setPositiveButton("Get Fact", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            EditText e=(EditText)v.findViewById(R.id.editText) ;
                            String number=e.getText().toString() ;

                            Intent i=new Intent() ;
                            i.putExtra("position" , position);
                            i.putExtra("number" , number);
                            i.setClass(MainActivity.this , Fact_Activity.class) ;
                            startActivity(i);

                        }
                    });
                    db.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss() ;
                        }
                    });
                    db.create().show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            AlertDialog.Builder db=new AlertDialog.Builder(MainActivity.this);
            db.setTitle("About");

            db.setMessage("Any Doubt About APP ? Feel Free To mail us !!") ;
            final View v=getLayoutInflater().inflate(R.layout.about , null) ;
            //TextView t=(TextView) v.findViewById(R.id.textView) ;
            // t.setText("Enter Year :");
            db.setView(v) ;
            db.setPositiveButton("Email-Us", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent i = new Intent();
                    i.setAction(Intent.ACTION_SENDTO);
                    //i.setData(Uri.parse("sms:9971489388"));
                    i.setData(Uri.parse("mailto:chadha.sagarpreet97@gmail.com"));
                    i.putExtra(Intent.EXTRA_SUBJECT, "OMG APP !!");
                    if (i.resolveActivity(getPackageManager()) != null) {
                        startActivity(i);
                    } else {
                        Toast.makeText(MainActivity.this , "No email client", Toast.LENGTH_LONG).show();
                    }

                }
            });
            db.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss() ;
                }
            });
            db.create().show();
            return  true ;
        }

        return super.onOptionsItemSelected(item);
    }
}
