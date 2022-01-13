package com.example.internetinterfaceforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {


    protected Button myButton;
    String myString = "Hey kids, have a great day";

    AutoCompleteTextView autoCompleteTextView;
    TextView textView;
    String[] strings = {"Exit"};
    ArrayAdapter<String> adapter;
    private ImageButton myImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        myButton = (Button) findViewById (R.id.btn_here);

        myButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Toast.makeText (getApplicationContext (), myString, Toast.LENGTH_LONG).show ();
            }
        });


        autoCompleteTextView = findViewById (R.id.actv);


        adapter = new ArrayAdapter<> (this
                , android.R.layout.simple_dropdown_item_1line, strings);

        autoCompleteTextView.setThreshold (1);

        autoCompleteTextView.setAdapter (adapter);

        autoCompleteTextView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                textView.setText (adapter.getItem (position));
            }
        });

        myImageButton = (ImageButton) findViewById (R.id.profile);

        myImageButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent (MainActivity.this, ThirdActivity.class);
                startActivity (intentLoadNewActivity);
            }
        });

            myImageButton = (ImageButton) findViewById (R.id.bulat);

            myImageButton.setOnClickListener (new View.OnClickListener () {
                @Override
                public void onClick(View v) {
                    Intent intentLoadNewActivity = new Intent (MainActivity.this, Second.class);
                    startActivity (intentLoadNewActivity);
                }
            });

        myImageButton = (ImageButton) findViewById (R.id.prima);

        myImageButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent (MainActivity.this, ActivityFourth.class);
                startActivity (intentLoadNewActivity);
            }
        });

        myImageButton = (ImageButton) findViewById (R.id.provinsi);

        myImageButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent (MainActivity.this, ActivityFifth.class);
                startActivity (intentLoadNewActivity);
            }
        });

        }

        }