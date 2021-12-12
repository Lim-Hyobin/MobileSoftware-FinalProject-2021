package com.course.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView topView, bottomView;
    TextView phoneView, mailView, mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topView = (TextView)findViewById(R.id.topText);
        bottomView= (TextView)findViewById(R.id.bottomText);
        phoneView = (TextView)findViewById(R.id.phoneView);
        mailView = (TextView)findViewById(R.id.mailView);
        mapView = (TextView)findViewById(R.id.mapView);

        topView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Context context = v.getContext();
                Intent intent = new Intent(context, TopActivity.class);
                context.startActivity(intent);
            }
        });

        bottomView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Context context = v.getContext();
                Intent intent = new Intent(context, BottomActivity.class);
                context.startActivity(intent);
            }
        });

        phoneView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01090240782"));
                startActivity(intent);
            }
        });

        mailView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sendEmail();
            }
        });

        mapView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Context context = v.getContext();
                Intent intent = new Intent(context, MapsActivity.class);
                context.startActivity(intent);
            }
        });

    }

    protected void sendEmail(){

        String[] TO = {""};
        String[] CC = {""};

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "");

        try {
            startActivity(Intent.createChooser(emailIntent, "이메일 보내기..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "이메일 클라이언트가 없네요.", Toast.LENGTH_SHORT).show();
        }
    }

}
