package com.example.appone;

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
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adds "resultsBtn" to button object
        Button resultsBtn = (Button) findViewById(R.id.resultsBtn);
        // Event listener for button
        resultsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Application will grab two integers and display the results in textView to user...
                /// VARIABLES ///
                // EditText line takes an input and puts it into an output.
                EditText inputOne = (EditText) findViewById(R.id.inputOne);
                EditText inputTwo = (EditText) findViewById(R.id.inputTwo);
                // TextView line acts as an output and displays input calculations.
                TextView resultsView = (TextView) findViewById(R.id.resultsView);

                /// EXECUTION ///
                // num1 and num2 takes integers from input boxes, then calculates them when
                // result button is clicked bt user.
                int num1 = Integer.parseInt(inputOne.getText().toString());
                int num2 = Integer.parseInt(inputTwo.getText().toString());

                // Holds values from num1 and num2.
                int result = num1 + num2;

                // Outputs result.
                // result + "", is the quickest way to convert an integer to a string.
                resultsView.setText(result + "");



                // Application will attempt to launch user outside application to google...
                Button googleBtn = (Button)findViewById(R.id.googleBtn);
                // Set onClickListener
                googleBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String google = "http://www.google.com";
                        Uri webaddress = Uri.parse(google);
                        Intent gotogoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                        // Statement check to see if the response was null.
                        if(gotogoogle.resolveActivity(getPackageManager()) != null){
                            startActivity(gotogoogle);
                        }
                    }
                });


                // Application will attempt to launch user outside application to coolmathforkids.com...
                Button coolMathBtn = (Button) findViewById(R.id.coolMathBtn);
                // Set onClickListener
                coolMathBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String cml = "https://www.coolmath4kids.com";
                        Uri webaddress = Uri.parse(cml);
                        Intent gotocml = new Intent(Intent.ACTION_VIEW, webaddress);
                        // Statement check to see if response was null.
                        if(gotocml.resolveActivity(getPackageManager()) != null) {
                            startActivity(gotocml);
                        }
                    }
                });
            }
        });
    }
}
