package com.example.apptwo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button webBtn = (Button) findViewById(R.id.webBtn);
        webBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String website = "http://www.google.com";
                Uri webaddress = Uri.parse(website);
                Intent gotogoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotogoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotogoogle);
                }
            }
        });
    }
}
