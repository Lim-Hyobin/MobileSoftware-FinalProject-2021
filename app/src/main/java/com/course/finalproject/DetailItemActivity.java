package com.course.finalproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        Intent intent = getIntent();

        int img = intent.getExtras().getInt("imageID");
        int img2 = intent.getExtras().getInt("imageID2");
        int price = intent.getIntExtra("price", 0);
        String url = intent.getExtras().getString("url");

        ImageView mainImg = findViewById(R.id.imageView);
        TextView nameText = findViewById(R.id.name);
        TextView descText = findViewById(R.id.description);
        TextView priceText = findViewById(R.id.price);
        ImageView subImg1 = findViewById(R.id.imageView2);
        ImageView subImg2 = findViewById(R.id.imageView3);
        TextView urlText = findViewById(R.id.url);


        mainImg.setImageResource(img);
        nameText.setText(intent.getExtras().getString("name"));
        descText.setText(intent.getExtras().getString("desc"));
        priceText.setText(price+ " 원");
        subImg1.setImageResource(img);
        subImg2.setImageResource(img2);
        urlText.setText("웹사이트 연결");

        urlText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Context context = v.getContext();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                try{
                    context.startActivity(intent);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

    }

}
