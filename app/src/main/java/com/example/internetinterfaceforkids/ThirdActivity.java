package com.example.internetinterfaceforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ThirdActivity extends AppCompatActivity {

     ImageButton myImageButton;
     Object v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_third);

        myImageButton = (ImageButton) findViewById (R.id.imageButton3);

        myImageButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String nomor = "081251850935" ;
                Intent panggil = new Intent(Intent. ACTION_DIAL);
                panggil.setData(Uri. fromParts("tel",nomor,null));
                startActivity(panggil);

            }
        });





            }


    }
